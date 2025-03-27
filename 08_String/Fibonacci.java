public class Fibonacci {
    // Method to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        // Print first two terms
        System.out.print(a + " " + b);

        // Loop to generate the series
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 10; // Number of terms
        System.out.println("Fibonacci Series:");
        printFibonacci(n);
    }
}
