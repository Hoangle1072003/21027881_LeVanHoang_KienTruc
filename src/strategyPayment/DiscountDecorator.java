package strategyPayment;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:54
 */
public class DiscountDecorator extends PaymentDecorator {

    public DiscountDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    public void pay(double amount) {
        double discount = amount * 0.1;
        System.out.println("Applying discount: " + discount);
        super.pay(amount - discount);
    }
}
