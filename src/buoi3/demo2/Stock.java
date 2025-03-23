package buoi3.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * File: Stock.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:45 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Stock implements Subject {
    private String name;
    private float price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(float newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers("Stock " + name + " changed to: " + price);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
