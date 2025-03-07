public class palindromPyramid {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            // spaces -(n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // decending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // acending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
