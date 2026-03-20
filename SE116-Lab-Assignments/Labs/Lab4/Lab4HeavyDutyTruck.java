public class Lab4HeavyDutyTruck extends Lab4Truck {
    private int axleCount;

    public Lab4HeavyDutyTruck(String licencePlate, double dailyRate, double cargoCapacity, int axleCount) {
        super(licencePlate, dailyRate, cargoCapacity);
        this.axleCount = axleCount;
    }

    @Override
    public double calculateRental(int days) {
        return this.getDailyRate() * days * this.axleCount;
    }

    public int getAxleCount() {
        return this.axleCount;
    }
}
