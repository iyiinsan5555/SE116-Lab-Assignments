public class TriphibianExplorer extends BaseVehicle implements Flyable, Swimmable, Drivable, Autonomous {
    @Override
    public boolean runSelfDiagnostic() {
        return false;
    }

    @Override
    public void updateSoftware() {

    }

    @Override
    public double calculateEnergyConsumption(double distance) {
        return distance * 2.0;
    }

    @Override
    public String getCurrentEnvironment() {
        return "";
    }

    @Override
    public void drive(double speed) {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void fly(double altitude) {

    }

    @Override
    public void dive(double depth) {

    }

    @Override
    public double getWaterResistance() {
        return 0;
    }
}
