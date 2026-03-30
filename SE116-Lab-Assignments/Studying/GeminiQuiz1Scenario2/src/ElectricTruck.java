import java.util.Random;

public class ElectricTruck extends BaseVehicle implements Drivable, Autonomous {

    public ElectricTruck(String vehicleID, double batteryLevel, double weightKg) {
        super(vehicleID, batteryLevel, weightKg);
    }

    @Override
    public double calculateEnergyConsumption(double distance) {
        return (distance * 0.5) + (getWeightKg() * 0.01);
    }

    @Override
    public boolean runSelfDiagnostic() {
        return getBatteryLevel() > 15;
    }

    @Override
    public void updateSoftware() {
        System.out.println("Updating navigation systems...");
    }

    @Override
    public void drive(double speed) {
        System.out.println("Driving at "+speed+" km/h.");
    }

    @Override
    public String getCurrentEnvironment() {
        return "Land";
    }
}
