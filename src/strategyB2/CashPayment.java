package strategyB2;

/**
 * File: CashPayment.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:09 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using cash");
    }
}
