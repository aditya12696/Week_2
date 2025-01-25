package day6.problem_statements.e_commerce_platform;

public class Groceries extends Product {
    private double discountRate;

    // Constructor
    public Groceries(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    // Override calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }

    // Groceries do not implement Taxable as they are tax-exempt in this example
}

