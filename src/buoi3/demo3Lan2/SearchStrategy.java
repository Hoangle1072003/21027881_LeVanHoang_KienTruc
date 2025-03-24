package buoi3.demo3Lan2;

import java.util.List;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:38
 */
public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
