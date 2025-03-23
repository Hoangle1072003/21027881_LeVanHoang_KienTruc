package factorymethod;

/**
 * File: TPBank.java
 * Author: Le Van Hoang
 * Date: 3/21/2025 (21/03/2025)
 * Time: 11:42 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "TPBank";
    }
}
