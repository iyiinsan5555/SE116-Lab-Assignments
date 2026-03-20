// Base class vehicle
class Vehicle {
    int maxSpeed = 120;
}

// subclass Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;

    void display()
    {
        // print maxSpeed from the vehicle class 
        // using super
        System.out.println("Maximum Speed: "+ super.maxSpeed);
    }
}

// Driver Program
class Test {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}