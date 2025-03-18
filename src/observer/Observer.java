package observer;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-18
 * Time: 18:40
 */
public interface Observer {
    public void update();

    public void setSubject(Subject sub);
}
