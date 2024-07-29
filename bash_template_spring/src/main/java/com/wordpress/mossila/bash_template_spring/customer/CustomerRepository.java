package com.wordpress.mossila.bash_template_spring.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, byte[]> {
    @Override
    List<Customer> findAll();
}
