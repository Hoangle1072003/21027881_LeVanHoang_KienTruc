package buoi3.demo2;

/**
 * File: null.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 4:44 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}
