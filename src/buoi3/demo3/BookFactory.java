package buoi3.demo3;

/**
 * File: BookFactory.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 11:26 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class BookFactory {
    public static Book createBook(String type, String title, String author, String category) {
        return switch (type.toLowerCase()) {
            case "physical" -> new PhysicalBook(title, author, category);
            case "ebook" -> new EBook(title, author, category);
            case "audiobook" -> new AudioBook(title, author, category);
            default -> throw new IllegalArgumentException("Invalid book type");
        };
    }
}
