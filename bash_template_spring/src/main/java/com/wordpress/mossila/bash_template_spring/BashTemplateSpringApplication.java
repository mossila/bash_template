package com.wordpress.mossila.bash_template_spring;

import com.wordpress.mossila.bash_template_spring.customer.Customer;
import com.wordpress.mossila.bash_template_spring.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BashTemplateSpringApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(BashTemplateSpringApplication.class);

	private final CustomerRepository customerRepository;

	BashTemplateSpringApplication(final CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(BashTemplateSpringApplication.class, args);
	}
	@Override
	public void run(String... args) {
		List<Customer> customers = customerRepository.findAll();

		for (Customer customer : customers) {
            logger.info("ID: {}, Name: {}, Surname: {}", customer.getId(), customer.getName(), customer.getSurname());
		}
	}
}
