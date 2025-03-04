package factory;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-04
 * Time: 19:14
 */
public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
