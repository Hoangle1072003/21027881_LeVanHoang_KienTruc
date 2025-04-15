package com.example.order_service.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * File: ResProductByIdClient.java
 * Author: Le Van Hoang
 * Date: 4/15/2025 (15/04/2025)
 * Time: 7:27 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResProductByIdClient {
    private String id;
    private String name;
    private Double price;
    private String description;
    private int stock;
}
