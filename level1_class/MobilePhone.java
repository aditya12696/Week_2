package Level1_class;

public class MobilePhone {
    // Class attributes
    private String brand;
    private int model;
    private float price;

    // Constructor
    MobilePhone(String brand, int model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display details of phone
    public void phoneDetail(){
        System.out.println("Mobile brand is: " + brand);
        System.out.println("Mobile model is: " + model);
        System.out.println("Mobile price is: " + price);
    }

}

class MobilePhoneObject{
    public static void main(String[] args) {
        // Create first object of Mobile phone class
        MobilePhone phone1 = new MobilePhone("MI",2015,15000);
        MobilePhone phone2 = new MobilePhone("OnePlus",2019,20000);
        MobilePhone phone3 = new MobilePhone("Poco",2020,25000);

        // Display Phone details
        phone1.phoneDetail();
        System.out.println("--------------------\n");
        phone2.phoneDetail();
        System.out.println("--------------------\n");
        phone3.phoneDetail();

    }
}
