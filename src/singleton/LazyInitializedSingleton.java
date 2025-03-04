package singleton;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-04
 * Time: 19:00
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
