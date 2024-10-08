//basic structure

class ClassName {
  // fields
  // methods
}

Step 1: Define a Class

// Define a class named 'Car'
public class Car {
    // Attributes (properties) of the class
    String make;
    String model;
    int year;
    String color;

    // Constructor (used to initialize objects)
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display the details of the car
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    // Method to start the car
    public void startCar() {
        System.out.println(model + " is starting.");
    }

    // Method to stop the car
    public void stopCar() {
        System.out.println(model + " is stopping.");
    }
}
