package factory;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-04
 * Time: 19:10
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
