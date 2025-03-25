
public class oddEvenBIt {
    // Method to check if a number is even or odd using bit manipulation
    
        public static void checkEvenOdd(int n) {
            if ((n & 1) == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        }
    
        // Main method for testing
        public static void main(String[] args) {
            checkEvenOdd(4); // Even
            checkEvenOdd(7); // Odd
            checkEvenOdd(0); // Even
            checkEvenOdd(15); // Odd
            checkEvenOdd(-8); // Even
            checkEvenOdd(-11); // Odd 
            checkEvenOdd(+1); // Odd 
        }
    }
    

