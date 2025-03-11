package stateQuanLyDonHang;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:32
 */
public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Packing and shipping order...");
        context.setState(new DeliveredState());
    }
}
