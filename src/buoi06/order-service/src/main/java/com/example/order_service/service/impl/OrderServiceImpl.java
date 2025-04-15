package com.example.order_service.service.impl;

import com.example.order_service.dtos.request.ReqCreateOrderDto;
import com.example.order_service.dtos.response.ResCustomerByIdClient;
import com.example.order_service.dtos.response.ResProductByIdClient;
import com.example.order_service.repository.OrderRepository;
import com.example.order_service.schema.Order;
import com.example.order_service.service.OrderService;
import com.example.order_service.service.httpClient.CustomerClient;
import com.example.order_service.service.httpClient.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * File: OrderServiceImpl.java
 * Author: Le Van Hoang
 * Date: 4/15/2025 (15/04/2025)
 * Time: 7:04 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    @Override
    public Order save(ReqCreateOrderDto order) {
        ResCustomerByIdClient customer = customerClient.getCustomerById(order.getCustomerId());
        ResProductByIdClient product = productClient.getProductById(order.getProductId());
        if (customer != null && product != null) {
            System.out.println("customer: " + customer);
            System.out.println("product: " + product);
            if(product.getStock() > 0){
                Order order1 = new Order();
                order1.setCustomerId(order.getCustomerId());
                order1.setProductId(order.getProductId());
                order1.setQuantity(order.getQuantity());
                return orderRepository.save(order1);
            } else {
                System.out.println("Out of stock");
            }
        }
        return null;
    }
}
