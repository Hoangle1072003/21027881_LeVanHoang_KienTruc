package finalB2;

/**
 * File: PaymentDecorator.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:39 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy paymentStrategy;

    public PaymentDecorator(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
