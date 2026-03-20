public class Lab4Main {
    public static void main(String[] args) {
        Lab4Vehicle[] vehicleArray = new Lab4Vehicle[3];
        vehicleArray[0] = new Lab4Vehicle("ABC01", 0.2);
        vehicleArray[1] = new Lab4Truck("ABC02", 0.1, 20);
        vehicleArray[2] = new Lab4HeavyDutyTruck("ABC03", 0.3, 45, 2);

        for (Lab4Vehicle vehicle : vehicleArray) {
            System.out.println("Total Rent: " + vehicle.calculateRental(2) + "$");
            vehicle.safetyCheck();
        }
    }
}
