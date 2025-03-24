package buoi3.demo3Lan2;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:21
 */
public class BookFactory {
    public static Book createBook(BookType type, String title, String author, BookType bookType) {
        return switch (type) {
            case PHYSICAL -> new PhysicalBook(title, author, bookType);
            default -> throw new IllegalArgumentException("Loai sach khong hop le" + type);
        };
    }
}
