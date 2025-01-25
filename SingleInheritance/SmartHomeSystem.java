package Day5.SingleInheritance;

// Superclass Device
class Device {
    private String deviceId;
    private String status;

    // Constructor to initialize Device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Getter for deviceId
    public String getDeviceId() {
        return deviceId;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    private double temperatureSetting;

    // Constructor to initialize both Device and Thermostat attributes
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Setter for temperatureSetting
    public void setTemperature(double temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    // Getter for temperatureSetting
    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    // Override displayStatus to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass displayStatus method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("TH123", "Active", 24.0);

        // Display thermostat's current settings
        System.out.println("Thermostat Status:");
        thermostat.displayStatus();

        // Update temperature setting
        thermostat.setTemperature(22.5);
        System.out.println("\nUpdated Thermostat Status:");
        thermostat.displayStatus();
    }
}

