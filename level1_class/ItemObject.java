package Level1_class;

class Item {
    // Class attributes
    private int itemCode;
    private String itemName;
    private float price;
    public int quantity;
    private float totalPrice = 0;

    // Constructor
    Item(int itemCode, String itemName, float price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    // display item details
    public void itemDetails(){
        System.out.println("Item code is: " + itemCode);
        System.out.println("Item name is: " + itemName);
        System.out.println("Item price is: " + price);
    }

    // Calculate the total cost for a given quantity
    public void calculateTotalCost(){
        totalPrice = price * quantity;
    }

    // Display total price
    public void displayTotalPrice(){
        System.out.println("Total price of " + itemName + " for quantity " + quantity +" is: " +totalPrice);
    }
}

class ItemObject{
    public static void main(String[] args) {
        // Create first object of Item class
        Item item1 = new Item(12,"cake",60);

        // Create second object of Item class
        Item item2 = new Item(5,"pen",10);

        // Taking quantity
        item1.quantity = 10;
        item2.quantity = 12;

        // Calling calculate total cost method
        item1.calculateTotalCost();
        item2.calculateTotalCost();

        // display item details
        item1.itemDetails();
        System.out.println("--------------------\n");
        item2.itemDetails();
        System.out.println("--------------------\n");

        // display total price
        item1.displayTotalPrice();
        System.out.println("--------------------");
        item2.displayTotalPrice();
    }
}