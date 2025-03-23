package stateB2;

/**
 * File: OrderState.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:01 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public interface OrderState {
    void handle(OrderContext context);
}
