package TaxState;

/**
 * File: Demo.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:25 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Demo {
    public static void main(String[] args) {
        ProductWithStrategy product = new ProductWithStrategy("Laptop", 1000, new VATTax());
        product.display();

    }
}
