public class methodOverLoading {
      public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));       // Output: 5
        System.out.println(calc.add(2, 3, 4));    // Output: 9
    }
}
    // Method OverLoading

    class Calculator {
    // add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


