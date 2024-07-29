package com.wordpress.mossila.bash_template_spring.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, byte[]> {
    @Override
    @NonNull
    List<Customer> findAll();
}
