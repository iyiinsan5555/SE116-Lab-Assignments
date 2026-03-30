public class HydroPlane extends BaseVehicle implements Flyable, Swimmable {
    private boolean isFlying;

    public HydroPlane(String vehicleID, double batteryLevel, double weightKg)  {
        super(vehicleID, batteryLevel, weightKg);
        isFlying = false;
    }

    @Override
    public double calculateEnergyConsumption(double distance) {
        return (distance * 1.2);
    }

    @Override
    public String getCurrentEnvironment() {
        return "Air";
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off...");
    }

    @Override
    public void fly(double altitude) {
        isFlying = true;
    }

    public void dive(double depth){System.out.println("Diving...");}
    public double getWaterResistance(){return 0.0;}
}
