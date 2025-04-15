package com.example.customer_service.service;

import com.example.customer_service.schema.Customer;

import java.util.List;

/**
 * File: CustomerService.java
 * Author: Le Van Hoang
 * Date: 4/15/2025 (15/04/2025)
 * Time: 6:54 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */


public interface CustomerService {
    Customer save (Customer customer);

    List<Customer> findAll();

    Customer findById(String id);
}
