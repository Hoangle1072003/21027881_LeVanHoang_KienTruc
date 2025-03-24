package buoi3.demo3Lan2;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:21
 */
public class PhysicalBook implements Book {
    private String title;

    private String author;
    private BookType bookType;


    public PhysicalBook(String title, String author, BookType bookType) {
        this.title = title;
        this.author = author;
        this.bookType = bookType;
    }

    @Override
    public void read() {
        System.out.println("Tieu de: " + title + ", Tac gia: " + author + ", The loai: " + bookType);

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Tieu de: " + title + ", Tac gia: " + author + ", The loai: " + bookType;
    }
}
