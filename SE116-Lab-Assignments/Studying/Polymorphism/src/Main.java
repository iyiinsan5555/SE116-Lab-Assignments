public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car(), new Bike(), new Boat()};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }
}
