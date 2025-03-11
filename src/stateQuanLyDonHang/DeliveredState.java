package stateQuanLyDonHang;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:32
 */
public class DeliveredState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Order has been delivered.");
    }
}
