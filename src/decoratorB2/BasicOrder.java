package decoratorB2;

/**
 * File: BasicOrder.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:15 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class BasicOrder implements OrderComponent {
    @Override
    public double getCost() {
        return 100000;
    }

    @Override
    public String getDescription() {
        return "Basic Order";
    }
}
