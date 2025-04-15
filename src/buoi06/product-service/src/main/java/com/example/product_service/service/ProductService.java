package com.example.product_service.service;

import com.example.product_service.schema.Product;

import java.util.List;

/**
 * File: null.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:57 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Product findById(String id);
}
