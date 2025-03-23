package TaxState;

/**
 * File: ProductWithStrategy.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 12:24 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class ProductWithStrategy {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public ProductWithStrategy(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getTax() {
        return taxStrategy.calcuDoubleTax(price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void display() {
        System.out.println(name + " - Giá sau thuế: " + (price + getTax()));
    }
}
