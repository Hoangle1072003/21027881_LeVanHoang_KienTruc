package com.example.order_service.service;

import com.example.order_service.dtos.request.ReqCreateOrderDto;
import com.example.order_service.schema.Order;

/**
 * File: OrderService.java
 * Author: Le Van Hoang
 * Date: 4/15/2025 (15/04/2025)
 * Time: 7:04 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public interface OrderService {
    Order save(ReqCreateOrderDto order);
}
