package finalB2;

/**
 * File: ProcessingFeeDecorator.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:40 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class ProcessingFeeDecorator extends PaymentDecorator {
    
    public ProcessingFeeDecorator(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing fee is 5$");
        paymentStrategy.pay(amount + 5);
    }
}
