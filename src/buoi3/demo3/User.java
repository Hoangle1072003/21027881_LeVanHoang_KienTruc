package buoi3.demo3;

/**
 * File: User.java
 * Author: Le Van Hoang
 * Date: 3/23/2025 (23/03/2025)
 * Time: 12:37 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("User " + name + " : " + message);
    }
}
