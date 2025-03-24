package buoi3.demo3Lan2;

import java.util.List;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:09
 */
public class DemoLan2 {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        User user1 = new User("John");
        library.register(user1);
        Book physical = BookFactory.createBook(BookType.PHYSICAL, "Ban tinh ca mua dong", "Lee Van Hoang", BookType.PHYSICAL);
        Book physical1 = BookFactory.createBook(BookType.PHYSICAL, "Ban tinh ca mua nong", "Lee Van Hoang", BookType.PHYSICAL);
        library.addBook(physical);
        library.addBook(physical1);
        physical.read();
        physical1.read();
        System.out.println("Search by title");
        List<Book> books = library.search(new SearchByTitle(), "Ban tinh ca mua dong");
        System.out.println(books);

        System.out.println("Add new book");
        Book physical2 = BookFactory.createBook(BookType.PHYSICAL, "Ban tinh ca mua he", "Lee Van Hoang", BookType.PHYSICAL);
        library.addBook(physical2);
    }
}
