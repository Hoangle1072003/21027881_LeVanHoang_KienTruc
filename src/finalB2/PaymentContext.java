package finalB2;

/**
 * File: PaymentContext.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:35 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentContext() {
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
