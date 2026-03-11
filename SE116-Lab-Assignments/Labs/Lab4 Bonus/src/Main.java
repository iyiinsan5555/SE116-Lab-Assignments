public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicleArray = new Vehicle[3];
        vehicleArray[0] = new Vehicle("ABC01", 0.2);
        vehicleArray[1] = new Truck("ABC02", 0.1, 20);
        vehicleArray[2] = new HeavyDutyTruck("ABC03", 0.3, 45, 2);

        for (Vehicle vehicle : vehicleArray) {
            System.out.println("Total Rent: " + vehicle.calculateRental(2) + "$");
            vehicle.safetyCheck();
        }
    }
}
