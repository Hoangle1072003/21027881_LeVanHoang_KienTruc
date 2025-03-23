package stateB2;

/**
 * File: Demo.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:04 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Demo {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.processOrder();
        context.processOrder();
        context.processOrder();

    }
}
