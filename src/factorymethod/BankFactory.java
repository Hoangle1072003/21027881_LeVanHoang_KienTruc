package factorymethod;

/**
 * File: BankFactory.java
 * Author: Le Van Hoang
 * Date: 3/21/2025 (21/03/2025)
 * Time: 11:43 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class BankFactory {
//    public BankFactory() {
//    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }

    }
}
