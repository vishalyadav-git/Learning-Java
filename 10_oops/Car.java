// Car class representing an object
public class Car {
    // Attributes (Instance Variables)
    String brand;
    String model;
    int price;
    
    // Constructor
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: ₹" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota", "Fortuner", 4000000);
        Car car2 = new Car("Honda", "City", 1200000);

        // Displaying details
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
