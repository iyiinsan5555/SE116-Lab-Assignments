public class Truck extends Vehicle {
    private double cargoCapacity;
    private final int MAX_CARGO_CAPACITY = 40;

    public Truck(String licencePlate, double dailyRate, double cargoCapacity) {
        super(licencePlate, dailyRate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void safetyCheck() {
        if (cargoCapacity < MAX_CARGO_CAPACITY) {
            System.out.println("Safe!");
        } else {
            System.out.println("Max cargo capacity exceeded.");
        }
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getMAX_CARGO_CAPACITY() {
        return MAX_CARGO_CAPACITY;
    }
}
