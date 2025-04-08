package com.example.product_service.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * File: ReqProductCreateDTO.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:59 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReqProductCreateDTO {
    private String name;
    private String description;
    private Double price;
    private int stock;
}
