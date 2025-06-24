public class TypeOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Vishal");  // Parameterized
        Student s2 = new Student(s1);        // Copy
        Student s3 = new Student();          // Default

        s1.display();  // Output: Vishal
        s2.display();  // Output: Vishal
        s3.display();  // Output: Unknown
    }
}

// Only ONE class Student with all three constructors
class Student {
    String name;

    // Default constructor
    Student() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
