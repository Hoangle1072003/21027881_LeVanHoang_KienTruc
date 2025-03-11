package stateQuanLyDonHang;

/**
 * @author Le Van Hoang
 * @version 1.0
 * @since 2025-03-11
 * Time: 19:33
 */
public class OrderManagementSystem {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.process();
        order.process();
        order.process();
    }
}
