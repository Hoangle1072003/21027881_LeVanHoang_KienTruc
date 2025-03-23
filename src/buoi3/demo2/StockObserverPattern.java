package buoi3.demo2;

/**
 * File: StockObserverPattern.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:46 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class StockObserverPattern {
    public static void main(String[] args) {
        Stock stock = new Stock("ABC", 100);
        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");
        stock.addObserver(investor1);
        stock.addObserver(investor2);
        stock.setPrice(110);
        stock.setPrice(120);
        stock.removeObserver(investor1);
        stock.setPrice(130);
    }
}
