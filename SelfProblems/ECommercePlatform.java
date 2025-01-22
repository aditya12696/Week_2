package Day4;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + name + ", Price: $" + price);
    }
}

// Order class
class Order {
    private static int orderCount = 0; // Static to track total orders
    private int orderId;
    private List<Product> products;

    // Constructor
    public Order() {
        this.orderId = ++orderCount;
        this.products = new ArrayList<>();
    }

    // Add product to the order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product " + product.getName() + " added to Order ID " + orderId);
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}

// Customer class
class Customer {
    private String name;
    private List<Order> orders;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed by Customer: " + name);
    }

    // Display customer orders
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Order History:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Headphones", 99.99);

        // Create a customer
        Customer customer1 = new Customer("Aditya");

        // Create orders
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        // Customer places orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Display customer's order history
        System.out.println("\nCustomer Order Details:");
        customer1.displayCustomerOrders();
    }
}
