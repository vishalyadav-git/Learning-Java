import java.util.*;


public class binomialCoefficent {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int binCoeff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int rmr_fact = factorial(n-r);

        int binCoeff = n_fact/(r_fact*rmr_fact);
        return binCoeff;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int value = factorial(n);
    System.out.println(value);
    System.out.println(binCoeff(5,2));
    }
    
}
