package decoratorB2;

/**
 * File: DiscountDecorator.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:15 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class DiscountDecorator implements OrderComponent {
    private OrderComponent order;

    public DiscountDecorator(OrderComponent order) {
        this.order = order;
    }

    @Override
    public double getCost() {
        return order.getCost() * 0.9;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + " with 10% discount";
    }
}
