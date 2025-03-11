package strategyPayment;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:54
 */
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();

        creditCard.pay(100);
        paypal.pay(200);

        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(new CreditCardPayment());
        creditCardWithFee.pay(100);

        PaymentStrategy paypalWithDiscount = new DiscountDecorator(new PayPalPayment());
        paypalWithDiscount.pay(200);

        PaymentStrategy bankTransferWithAll = new DiscountDecorator(new ProcessingFeeDecorator(new BankTransferPayment()));
        bankTransferWithAll.pay(500);
    }
}
