public class bitManipulation {
    
    
        // 1️⃣ Get Bit: Check if ith bit is 1 or 0
        public static boolean getBit(int n, int i) {
            int bitMask = 1 << i; // Shift 1 to ith position
            return (n & bitMask) != 0;
        }
    
        // 2️⃣ Set Bit: Set ith bit to 1
        public static int setBit(int n, int i) {
            int bitMask = 1 << i; // Shift 1 to ith position
            return n | bitMask;
        }
    
        // 3️⃣ Clear Bit: Set ith bit to 0
        public static int clearBit(int n, int i) {
            int bitMask = ~(1 << i); // Invert the bit at ith position
            return n & bitMask;
        }
    
        // 4️⃣ Update Bit: Update ith bit to 0 or 1
        public static int updateBit(int n, int i, int value) {
            int bitMask = ~(1 << i); // Clear ith bit
            n = n & bitMask; // Clear ith bit first
            return n | (value << i); // Set the new value
        }
    
        // 5️⃣ Toggle Bit: Flip the ith bit
        public static int toggleBit(int n, int i) {
            int bitMask = 1 << i; // Shift 1 to ith position
            return n ^ bitMask; // XOR flips the bit
        }
    
        // 6️⃣ Count Set Bits: Count number of 1s in binary
        public static int countSetBits(int n) {
            int count = 0;
            while (n > 0) {
                count += n & 1; // Check LSB
                n >>= 1; // Right shift n
            }
            return count;
        }
    
        public static void main(String[] args) {
            int n = 5; // Binary: 101
            int i = 2;
    
            // Get Bit
            System.out.println("Is bit " + i + " set? " + getBit(n, i)); // true
    
            // Set Bit
            System.out.println("Set bit " + i + ": " + setBit(n, i)); // 7 (111)
    
            // Clear Bit
            System.out.println("Clear bit " + i + ": " + clearBit(n, i)); // 5 (101)
    
            // Update Bit to 1
            System.out.println("Update bit " + i + " to 1: " + updateBit(n, i, 1)); // 7 (111)
    
            // Update Bit to 0
            System.out.println("Update bit " + i + " to 0: " + updateBit(n, i, 0)); // 5 (101)
    
            // Toggle Bit
            System.out.println("Toggle bit " + i + ": " + toggleBit(n, i)); // 7 (111)
    
            // Count Set Bits
            System.out.println("Number of set bits in " + n + ": " + countSetBits(n)); // 2
        }
    }
    

