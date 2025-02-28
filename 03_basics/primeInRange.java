import java.util.*;
public class primeInRange {

    public static boolean prime(int n){
        boolean isPrime= true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void range(int n){
        for(int i = 2; i <=n; i++){
            if(prime(i)){
                System.out.println(i+ " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
        range(20);
    }
}
