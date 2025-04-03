// Laptop class representing an object
public class Laptop {
    // Attributes (Instance Variables)
    String brand;
    String processor;
    int price;

    // Constructor
    public Laptop(String brand, String processor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    // Method to display laptop details
    public void displayLaptopInfo() {
        System.out.println("Brand: " + brand + ", Processor: " + processor + ", Price: ₹" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of Laptop class
        Laptop laptop1 = new Laptop("Acer", "Intel i7", 75000);
        Laptop laptop2 = new Laptop("HP", "Ryzen 5", 65000);

        // Displaying details
        laptop1.displayLaptopInfo();
        laptop2.displayLaptopInfo();
    }
}

