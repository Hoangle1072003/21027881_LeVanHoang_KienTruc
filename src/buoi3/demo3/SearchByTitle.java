package buoi3.demo3;

import java.util.List;

/**
 * File: SearchByTitle.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 11:42 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public class SearchByTitle implements SearchStrategy {

    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream().filter(b -> b.getTitle().contains(keyword)).toList();
    }
}
