package day6.problem_statements.e_commerce_platform;


public class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private double discountRate;

    // Constructor
    public Clothing(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    // Override calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }

    // Implement Taxable methods
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
