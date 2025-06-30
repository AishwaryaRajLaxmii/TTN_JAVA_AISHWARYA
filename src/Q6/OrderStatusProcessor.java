package Q6;

public class OrderStatusProcessor {

    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }

    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";

            case CANCELLED -> {
                System.out.println("Logging cancellation...");
                yield "Order has been canceled.";
            }
            case REFUNDED -> {
                System.out.println("Processing refund...");
                yield "Refund has been issued for the order.";
            }
        };
    }


    public static void main(String[] args) {
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(processOrderStatus(status));
        }
    }
}
