import java.util.Scanner;

public class product {
    // function defination
    public static int productOf(int a,int b){
        int sum = a*b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = productOf(a, b); //function call
        System.out.println("The product of " +a + " with " + +b +" is " + +sum);

    }
}
