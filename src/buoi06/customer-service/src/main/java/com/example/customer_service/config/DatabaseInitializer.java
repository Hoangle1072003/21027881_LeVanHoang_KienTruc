package com.example.customer_service.config;

import com.example.customer_service.repository.CustomerRepository;
import com.example.customer_service.schema.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * File: DatabaseInitializer.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:51 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */
@Service
@RequiredArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    @Override
    public void run(String... args) throws Exception {
        long count = customerRepository.count();
        if (count == 0) {
            for (int i = 0; i < 10; i++) {
                Customer customer = new Customer();
                customer.setName("Customer " + i);
                customer.setEmail("customer_" + i + "@example.com");
                customer.setPhone("123456789" + i);
                customerRepository.save(customer);

            }
        }
        if (count != 0) {
            System.out.println("Product count is " + count);
        }
        
    }
}
