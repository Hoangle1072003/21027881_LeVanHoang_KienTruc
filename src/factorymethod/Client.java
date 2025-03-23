package factorymethod;

/**
 * File: Client.java
 * Author: Le Van Hoang
 * Date: 3/21/2025 (21/03/2025)
 * Time: 11:44 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBank);
        System.out.println(bank.getBankName());
    }
}
