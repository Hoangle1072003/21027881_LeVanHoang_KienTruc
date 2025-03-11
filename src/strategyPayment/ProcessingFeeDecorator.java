package strategyPayment;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:53
 */
public class ProcessingFeeDecorator extends PaymentDecorator {

    public ProcessingFeeDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    public void pay(double amount) {
        double fee = amount * 0.02;
        System.out.println("Adding processing fee: " + fee);
        super.pay(amount + fee);
    }
}
