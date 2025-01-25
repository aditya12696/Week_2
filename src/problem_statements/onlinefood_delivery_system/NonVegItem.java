package day6.problem_statements.onlinefood_delivery_system;

public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0.0;
    }

    // Implement calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + additionalCharge) * getQuantity();
        return total - (total * discount / 100);
    }

    // Implement Discountable methods
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
        System.out.println("Discount of " + discountPercentage + "% applied to " + getItemName());
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}
