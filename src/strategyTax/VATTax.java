package strategyTax;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:43
 */
public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.10;
    }
}
