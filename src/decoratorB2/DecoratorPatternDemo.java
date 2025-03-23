package decoratorB2;

/**
 * File: DecoratorPatternDemo.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:16 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        OrderComponent basicOrder = new BasicOrder();
        System.out.println("Basic Order");
        System.out.println("Cost: " + basicOrder.getCost());
        System.out.println("Description: " + basicOrder.getDescription());
        OrderComponent discountOrder = new DiscountDecorator(basicOrder);
        System.out.println("Discount Order");
        System.out.println("Cost: " + discountOrder.getCost());
        System.out.println("Description: " + discountOrder.getDescription());
    }
}
