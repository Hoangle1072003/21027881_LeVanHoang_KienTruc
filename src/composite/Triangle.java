package composite;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-18
 * Time: 18:49
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}
