public class AutomatedPoliceStation extends InfrastructureEntity implements SecurityProtocol {
    private int droneCount;

    public AutomatedPoliceStation(String entityID, String location, double integrity, int droneCount) {
        super(entityID,location,integrity);
        this.droneCount = droneCount;
    }

    @Override
    public double calculateOperationalCost() {
        return droneCount * 50.0 + 500;
    }

    @Override
    public void performScan() {
        System.out.println("Drones from station "+ getEntityID() +" are patrolling "+ getLocation());
    }

    @Override
    public boolean isBreached() {
        return getIntegrity() < 20;
    }
}
