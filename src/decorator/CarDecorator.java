package decorator;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:05
 */
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
