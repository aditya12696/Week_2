package day6.problem_statements.e_commerce_platform;

public class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18; // 18% tax
    private double discountRate; // Discount rate as a percentage

    // Constructor
    public Electronics(String productId, String name, double price, double discountRate) {
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
        return "Electronics Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}

