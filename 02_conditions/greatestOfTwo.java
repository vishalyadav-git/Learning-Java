import java.util.*;
public class greatestOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("The value of num1 is greater " + num1);
        }
        else{
            System.out.println("The value of num2 is greater " + num2);

        }

    }
}
