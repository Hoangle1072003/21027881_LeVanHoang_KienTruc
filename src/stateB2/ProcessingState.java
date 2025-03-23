package stateB2;

/**
 * File: ProcessingState.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:03 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Order is in processing state");
        context.setState(new DeliveredState());
    }
}
