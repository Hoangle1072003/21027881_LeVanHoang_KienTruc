package buoi3.demo3;

/**
 * File: BasicBorrowing.java
 * Author: Le Van Hoang
 * Date: 3/23/2025 (23/03/2025)
 * Time: 12:58 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class BasicBorrowing implements Borrowable {
    private Book book;

    public BasicBorrowing(Book book) {
        this.book = book;
    }

    @Override
    public String borrow() {
        return "BasicBorrowing" + book.getTitle();
    }
}
