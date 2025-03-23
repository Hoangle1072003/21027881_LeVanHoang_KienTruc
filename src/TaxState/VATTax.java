package TaxState;

/**
 * File: VATTax.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:24 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class VATTax implements TaxStrategy {
    @Override
    public double calcuDoubleTax(double amount) {
        return amount * 0.1;
    }
}
