package com.example.product_service.controller;

import com.example.product_service.service.ProductService;
import com.example.product_service.shema.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * File: ProductController.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:55 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> products = productService.findAll();
        System.out.println("products: " + products);
        return ResponseEntity.ok(products);

    }
}
