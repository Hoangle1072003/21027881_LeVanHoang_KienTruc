package decorator;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:07
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
