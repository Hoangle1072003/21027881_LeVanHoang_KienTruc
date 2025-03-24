package buoi3.demo3Lan2;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-24
 * Time: 00:48
 */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println("User " + name + " : " + message);
    }
}
