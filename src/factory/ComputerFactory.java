package factory;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-04
 * Time: 19:13
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram,
                hdd, cpu);
        return null;
    }
}
