public class Inheritance {
        public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method
        d.bark();  // Dog's own method
    }
}
    // Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}



