package singleton;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-04
 * Time: 18:53
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new
            EagerInitializedSingleton();

    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
