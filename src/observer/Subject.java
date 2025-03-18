package observer;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-18
 * Time: 18:39
 */
public interface Subject {
    public void register(Observer obj);

    public void unregister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);
}
