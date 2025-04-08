package com.example.product_service.config;

import com.example.product_service.repository.ProductRepository;
import com.example.product_service.shema.Product;
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
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        long count = productRepository.count();
        if (count == 0) {
            for (int i = 0; i < 10; i++) {
                Product product = new Product();
                product.setName("Product 1");
                product.setDescription("Product 1 details");
                product.setPrice(3.0);
                product.setStock(3);
                productRepository.save(product);
            }
        }
        if (count != 0) {
            System.out.println("Product count is " + count);
        }
        
    }
}
