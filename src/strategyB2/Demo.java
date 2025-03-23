package strategyB2;

/**
 * File: Demo.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:11 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Demo {
    public static void main(String[] args) {
        Order order = new Order();
        order.setPaymentStrategy(new CreditCardPayment());
        order.pay(100);

        order.setPaymentStrategy(new PaypalPayment());
        order.pay(200);
    }
}
