public class Vehicle {
    public String motor = "Vehicle_Motor";

    public void start() {
        System.out.println("Vehicle started!");
    }
}

class Car extends Vehicle {
    public String motor = "Car_Motor";

    public void start() {
        System.out.println("Car started!");
    }
}

class Bike extends Vehicle {
    public String motor = "Bike_Motor";

    public void start() {
        System.out.println("Bike started!");
    }
}

class Plane extends Vehicle {
    public String motor = "Plane_Motor";

    public void start() {
        System.out.println("Plane started!");
    }

    public void fly() {
        System.out.println("Plane is flying.");
    }
}


class Main {
    public static void main(String[] args) {

        //Be aware that all reference types are Vehicle
        Vehicle vehicle = new Vehicle();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        Vehicle car = new Car();

        //Methods are polymorphic so whenever I call a method:
        //Java looks if the reference type has the method or not
        //Ex:
        //plane.fly(); //Cause an error

        //But the reference type has the method than it checks for the method in the object if not checks for upper and upper classes.
        plane.start(); //reference type has the start() method so it is good to call and because it is overridden in the plane class(object type) it will call the overridden method

        //But fields are not polymorphic!
        System.out.println(plane.motor); //will look to the reference type not object type! Because fields are not polymorphic!

        //Another examples that shows that methods are polymorphic
        bike.start();
        car.start();

        System.out.println("-----------------------------------");

        Vehicle[] vehicles = {vehicle, bike, car, plane};
        for (Vehicle vehicle1 : vehicles) {
            vehicle1.start();
            System.out.println(vehicle1.motor); // should always print "Vehicle_Motor" because java looks are reference type
        }
        System.out.println("-----------------DOWNCASTING------------------");
        //Downcasting
        Bike bike1 = (Bike) bike; //Now the reference type is Bike, whenever I call motor it should print "Bike_Motor"
        System.out.println(bike1.motor);

        System.out.println("-----------------UPCASTING------------------");
        //Upcasting
        Car car1 = new Car();
        Vehicle car2 = (Vehicle) car1;
        System.out.println(car1.motor); //reference type is Car
        System.out.println(car2.motor); //reference type is Vehicle
    }
}