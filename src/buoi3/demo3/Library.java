package buoi3.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * File: Library.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 11:09 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Library {
    private static Library instance;
    private List<Book> books = new ArrayList<>();
    private List<User> observers = new ArrayList<>();

    private Library() {
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("addBook " + book.getTitle());
    }

    public void notifyObservers(String message) {
        for (User user : observers) {
            user.update(message);
        }
    }

    public void registerObserver(User user) {
        observers.add(user);
    }


    public List<Book> search(SearchStrategy searchStrategy, String keyword) {
        return searchStrategy.search(books, keyword);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
