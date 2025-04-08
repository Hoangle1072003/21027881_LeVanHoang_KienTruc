package com.example.product_service.shema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * File: Products.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:38 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;
    private String description;
    private int stock;

}
