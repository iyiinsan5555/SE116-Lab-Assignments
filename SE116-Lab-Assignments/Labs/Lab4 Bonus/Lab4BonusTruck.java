public class Lab4BonusTruck extends Lab4Vehicle {
    private double cargoCapacity;
    private final int MAX_CARGO_CAPACITY = 40;

    public Lab4BonusTruck(String licencePlate, double dailyRate, double cargoCapacity) {
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

    @Override
    public boolean checkRisk() {
        if (cargoCapacity > 20) { //this 20 ton is a magic number, because my instructor tells me to do like that!
            return true;
        }
        return false;
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
