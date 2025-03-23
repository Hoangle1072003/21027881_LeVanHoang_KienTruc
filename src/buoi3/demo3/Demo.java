package buoi3.demo3;

import java.util.List;

/**
 * File: Demo.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 11:10 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class Demo {
    public static void main(String[] args) {
        Library library1 = Library.getInstance();
        User user1 = new User("John");
        library1.registerObserver(user1);

        Book book1 = BookFactory.createBook("physical", "Design Patterns", "GoF", "Software");
        library1.addBook(book1);
        System.out.println("-------------------");

        System.out.println(library1);

        Book book2 = BookFactory.createBook("physical", "Design Patterns", "GoF", "Software");
        library1.addBook(book2);

        List<Book> books = library1.search(new SearchByTitle(), "Design Patterns");
        System.out.println("Search results: " + books);


    }
}
