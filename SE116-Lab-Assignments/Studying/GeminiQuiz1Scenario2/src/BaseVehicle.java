public abstract class BaseVehicle {
    private String vehicleID;
    private double batteryLevel; //between 0-100
    private double weightKg;

    public BaseVehicle(String vehicleID, double batteryLevel, double weightKg) {
        this.vehicleID = vehicleID;
        this.batteryLevel = batteryLevel;
        this.weightKg = weightKg;
    }

    public void chargeBattery(double amount) {
        if (batteryLevel + amount > 100) {
            batteryLevel = 100;
        } else {
            batteryLevel += amount;
        }
    }

    //Check what happens when the abstract method is private
    public abstract double calculateEnergyConsumption(double distance);

    public abstract String getCurrentEnvironment(); //returns --> "Air", "Land", "Water"

    //Getters
    public String getVehicleID() {
        return vehicleID;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
