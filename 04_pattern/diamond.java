public class diamond {
    public static void pattern(int n){
        // outter loop
        for(int i=1; i<=n; i++){
            // space -(n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars -(2*i)-1
            for(int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half inverted
        for(int i=n; i>=1; i--){
           
                // space -(n-i)
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                // stars -(2*i)-1
                for(int j=1; j<= (2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
