package Day5.MultilevelInheritance;

// Base class Order
class Order {
    private String orderId;
    private String orderDate;

    // Constructor to initialize Order attributes
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Getter for orderId
    public String getOrderId() {
        return orderId;
    }

    // Getter for orderDate
    public String getOrderDate() {
        return orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Display basic order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass ShippedOrder extending Order
class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor to initialize Order and ShippedOrder attributes
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call superclass constructor
        this.trackingNumber = trackingNumber;
    }

    // Getter for trackingNumber
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // Override getOrderStatus to include shipping status
    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    // Display order and shipping details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass DeliveredOrder extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor to initialize ShippedOrder and DeliveredOrder attributes
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Getter for deliveryDate
    public String getDeliveryDate() {
        return deliveryDate;
    }

    // Override getOrderStatus to include delivery status
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    // Display full order details including delivery info
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Create a basic order
        Order order = new Order("ORD001", "2025-01-23");
        System.out.println("Basic Order Details:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        // Create a shipped order
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-20", "TRK12345");
        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        // Create a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-18", "TRK67890", "2025-01-22");
        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
