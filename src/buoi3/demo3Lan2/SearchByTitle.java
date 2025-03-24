package buoi3.demo3Lan2;

import java.util.List;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:39
 */
public class SearchByTitle implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream().filter(title -> title.getTitle().contains(keyword)).toList();
    }
}
