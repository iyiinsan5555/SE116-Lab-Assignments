public class SmartCityApp {
    public static void main(String[] args) {
        CityManager cityManager = new CityManager();
        cityManager.addEntity(new SmartPowerBank("251251", "Bahama", 55, 11));
        cityManager.addEntity(new AutomatedPoliceStation("12512", "Düzce", 77, 2));
        cityManager.addEntity(new SolarPlant("616251", "Angara", 66, 5));

        cityManager.processEnergyGrid();
        cityManager.runSecurityCheck();
        cityManager.upgradeAllPossible(22);
    }
}
