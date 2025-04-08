package com.example.product_service.repository;

import com.example.product_service.shema.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * File: null.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:50 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
