package day6.problem_statements.e_commerce_platform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add Electronics, Clothing, and Groceries to the list
        products.add(new Electronics("E101", "SDD", 50000, 10)); // 10% discount
        products.add(new Clothing("C202", "RTX 4060", 1000, 5));         // 5% discount
        products.add(new Groceries("G303", "DDR5 RAM 8GB", 2000, 2));       // 2% discount

        // Calculate and print final price for each product
        for (Product product : products) {
            System.out.println("--------------------");
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + product.calculateDiscount());

            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            System.out.println("Tax: " + tax);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - product.calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}

