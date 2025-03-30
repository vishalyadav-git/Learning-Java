
public class powerOfTwo {

        public static boolean isPowerOfTwo(int n) {
            
            // Check if n > 0 and n & (n - 1) is 0
            return (n > 0) && ((n & (n - 1)) == 0);
        }
        
        public static void main(String args[]){
            int n = 1;
           System.out.println(isPowerOfTwo(n)); 
        }
    }

