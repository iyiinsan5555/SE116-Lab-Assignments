public class SolarPlant extends InfrastructureEntity implements EnergyProducer, Upgradable {
    private int panelCount;

    public SolarPlant(String entityID, String location, double integrity, int panelCount) {
        super(entityID, location, integrity);
        this.panelCount = panelCount;
    }

    @Override
    public double calculateOperationalCost() {
        return panelCount * 5.5;
    }

    @Override
    public double generatePower() {
        return panelCount * 12.0;
    }

    @Override
    public void applyFirmwareUpdate(double integrityBoost) {
        this.setIntegrity(this.getIntegrity() + 20);
    }
}
