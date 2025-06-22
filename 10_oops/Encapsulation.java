public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Vishal");
        s.setAge(20);

        System.out.println(s.getName()); // Vishal
        System.out.println(s.getAge());  // 20
    }
}

class Student {
    // Step 1: private data members
    private String name;
    private int age;

    // Step 2: public getter method
    public String getName() {
        return name;
    }

    // Step 3: public setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // optional validation
        if (age > 0) {
            this.age = age;
        }
    }
}
