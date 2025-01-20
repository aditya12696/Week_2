package Day3;

class Product {
    // Static variable
    private static double discount = 10.0; // Discount in percentage

    // Instance variables
    private String productName;
    private final int productID; // Final variable
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: " + price);
            System.out.println("Discounted Price: " + discountedPrice);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 101, 50000.0, 2);
        Product product2 = new Product("Smartphone", 102, 20000.0, 3);

        // Displaying initial product details
        System.out.println("Initial Product Details:");
        product1.displayProductDetails();
        System.out.println("--------------------");
        product2.displayProductDetails();
        System.out.println("--------------------");

        // Updating the discount
        Product.updateDiscount(15.0);

        // Displaying updated product details
        System.out.println("Updated Product Details with Discount:");
        product1.displayProductDetails();
        System.out.println("--------------------");
        product2.displayProductDetails();
        System.out.println("--------------------");
    }
}
