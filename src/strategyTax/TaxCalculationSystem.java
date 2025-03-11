package strategyTax;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:44
 */
public class TaxCalculationSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, new VATTax());
        product1.displayPrice();

        Product product2 = new Product("Food Item", 500, new ConsumptionTax());
        product2.displayPrice();

        Product product3 = new Product("Luxury Car", 50000, new LuxuryTax());
        product3.displayPrice();
    }
}
