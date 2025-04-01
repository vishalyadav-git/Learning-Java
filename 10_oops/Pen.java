public class Pen {
    String color;
    String type;
    int price; // Using int instead of double

    // Constructor
    Pen(String c, String t, int p) {
        color = c;
        type = t;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println("Color: " + color + ", Type: " + type + ", Price: ₹" + price);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of Pen class
        Pen pen1 = new Pen("Blue", "Gel", 10);
        Pen pen2 = new Pen("Black", "Ballpoint", 5);

        // Displaying pen details
        pen1.display();
        pen2.display();
    }
}
