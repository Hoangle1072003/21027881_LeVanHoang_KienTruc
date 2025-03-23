package buoi3.demo3;

import java.util.List;

/**
 * File: SearchStrategy.java
 * Author: Le Van Hoang
 * Date: 3/22/2025 (22/03/2025)
 * Time: 11:41 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
