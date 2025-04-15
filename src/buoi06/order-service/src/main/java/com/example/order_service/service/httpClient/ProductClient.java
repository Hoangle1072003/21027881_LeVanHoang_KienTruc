package com.example.order_service.service.httpClient;

import com.example.order_service.dtos.response.ResProductByIdClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * File: null.java
 * Author: Le Van Hoang
 * Date: 4/15/2025 (15/04/2025)
 * Time: 7:28 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/api/v1/products/{id}")
    ResProductByIdClient getProductById(@PathVariable String id) ;
}
