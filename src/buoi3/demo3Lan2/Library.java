package buoi3.demo3Lan2;

import java.util.ArrayList;
import java.util.List;

/**
 * File: Instance.java
 * Author: Le Van Hoang
 * Date: 3/24/2025 (24/03/2025)
 * Time: 12:02 AM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<User> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifi("add book: " + book.getTitle());
    }

    public List<Book> search(SearchStrategy searchStrategy, String keyword) {
        return searchStrategy.search(books, keyword);
    }

    public void notifi(String message) {
        for (User user : observers) {
            user.update(message);
        }
    }

    public void register(User user) {
        observers.add(user);
    }
}
