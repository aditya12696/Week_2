package day6.problem_statements.onlinefood_delivery_system;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Encapsulation: Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

