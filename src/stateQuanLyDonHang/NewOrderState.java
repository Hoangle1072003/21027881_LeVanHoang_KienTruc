package stateQuanLyDonHang;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:31
 */
public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("New order is created...");
        context.setState(new ProcessingState());
    }
}
