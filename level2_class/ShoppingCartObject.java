package Level2_class;

import java.util.ArrayList;

class CartItem {
    // Class attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set quantity (used when removing or updating)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    // List to hold CartItem objects
    private ArrayList<CartItem> cartItems;

    // Constructor
    ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                // Update quantity if the item already exists
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println(quantity + " more of " + itemName + " added to the cart.");
                return;
            }
        }
        // If item is not in the cart, add a new CartItem
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " of " + itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " is not in the cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("Cart Items:");
        for (CartItem item : cartItems) {
            System.out.println(item.getQuantity() + " x " + item.getItemName() + " @ $" + item.getPrice() + " each");
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}

class ShoppingCartObject {
    public static void main(String[] args) {
        // Create a ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Apple", 0.99, 5);
        cart.addItem("Banana", 0.59, 10);
        cart.addItem("Milk", 2.50, 2);

        // Display total cost
        cart.displayTotalCost();

        System.out.println("--------------------");

        // Remove an item and display total cost again
        cart.removeItem("Banana");
        cart.displayTotalCost();
    }
}
