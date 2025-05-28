// This is an abstract class. It can't create objects, but it can be used as a template.
abstract class Vehicle {
    // Abstract method. It doesn't have a body, only a declaration.
    abstract void move();
}

// Car is a concrete class that inherits from Vehicle and gives a specific way to move.
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car is driving.");
    }
}

// Bike is another concrete class that inherits from Vehicle and gives a specific way to move.
class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("The bike is pedaling.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // We can't create an object of Vehicle because it's abstract.
        // Vehicle v = new Vehicle(); // This would cause an error

        // But we can create objects of Car and Bike and use the move method.
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.move(); // Output: The car is driving.
        myBike.move(); // Output: The bike is pedaling.
    }
}
