package Day2.Level1.InstanceVsClass;

public class Products {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 75000.0);
        Product product2 = new Product("Smartphone", 30000.0);
        Product product3 = new Product("Tablet", 20000.0);

        // Displaying details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("--------------------\n");

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();

        System.out.println("--------------------\n");

        System.out.println("Product 3 Details:");
        product3.displayProductDetails();

        System.out.println("--------------------\n");

        // Displaying total number of products
        Product.displayTotalProducts();
    }
}

class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
