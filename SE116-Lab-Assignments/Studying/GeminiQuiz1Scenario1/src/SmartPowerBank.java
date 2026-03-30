public class SmartPowerBank extends InfrastructureEntity implements EnergyProducer, SecurityProtocol, Upgradable{
    private double capacityKWh;

    public SmartPowerBank(String entityID, String location, double integrity, double capacityKWh) {
        super(entityID,location,integrity);
        this.capacityKWh = capacityKWh;
    }

    @Override
    public double calculateOperationalCost() {
        return capacityKWh * 0.25;
    }

    @Override
    public double generatePower() {
        return capacityKWh * 0.95;
    }

    @Override
    public void performScan() {
        System.out.println("Checking firewall integrity for Power Bank "+getEntityID()+" ...");
    }

    @Override
    public boolean isBreached() {
        return getIntegrity() < 20;
    }

    @Override
    public void applyFirmwareUpdate(double integrityBoost) {
        this.setIntegrity(this.getIntegrity() + integrityBoost);
    }
}
