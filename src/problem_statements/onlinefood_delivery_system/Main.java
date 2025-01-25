package day6.problem_statements.onlinefood_delivery_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of FoodItem objects
        List<FoodItem> orderItems = new ArrayList<>();

        // Add Veg and Non-Veg items to the order
        VegItem vegItem = new VegItem("Paneer Butter Masala", 250, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Apply discounts
        vegItem.applyDiscount(10); // 10% discount
        nonVegItem.applyDiscount(5); // 5% discount

        orderItems.add(vegItem);
        orderItems.add(nonVegItem);

        // Process order and display details
        System.out.println("Order Details:");
        double totalOrderCost = 0.0;

        for (FoodItem item : orderItems) {
            System.out.println("---------------------");
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }

            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price (after discount): ₹" + totalPrice);
            totalOrderCost += totalPrice;
        }

        System.out.println("---------------------");
        System.out.println("Total Order Cost: ₹" + totalOrderCost);
    }
}
