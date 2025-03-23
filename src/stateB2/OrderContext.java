package stateB2;

/**
 * File: OrderContext.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:01 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new NewState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handle(this);
    }
}
