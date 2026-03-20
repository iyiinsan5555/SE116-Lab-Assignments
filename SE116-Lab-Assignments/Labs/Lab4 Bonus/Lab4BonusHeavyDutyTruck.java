public class Lab4BonusHeavyDutyTruck extends Lab4Truck {
    private int axleCount;
    private final int MAX_AXLE_COUNT = 4;

    public Lab4BonusHeavyDutyTruck(String licencePlate, double dailyRate, double cargoCapacity, int axleCount) {
        super(licencePlate, dailyRate, cargoCapacity);
        this.axleCount = axleCount;
    }

    @Override
    public boolean checkRisk() {
        if (axleCount > MAX_AXLE_COUNT) {
            return true;
        }

        return false;
    }

    @Override
    public double calculateRental(int days) {
        return this.getDailyRate() * days * this.axleCount;
    }

    public int getAxleCount() {
        return this.axleCount;
    }

    public int getMAX_AXLE_COUNT() {return this.MAX_AXLE_COUNT;}

}
