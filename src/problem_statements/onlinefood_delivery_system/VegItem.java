package day6.problem_statements.onlinefood_delivery_system;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    // Implement calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
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
