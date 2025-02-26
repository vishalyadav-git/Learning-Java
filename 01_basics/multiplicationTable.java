import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 0;
        System.out.println("enter the no: ");
        for(int i = 1; i<=10; i++){
            product = n*i;
            System.out.println("Multiplication is: " +product);
            
        }
    }
}
