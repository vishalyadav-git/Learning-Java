import java.util.*;
public class incomeTax {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax = 0;
    if (income<500000) {
        tax = 0;
    }
    else if (income<=1000000 && income>=500000) {
        tax = (int) (income * 0.2);
    }
    else if(income>=1000000){
        tax = (int) (income *0.3);
    }
    System.out.println("ur tax amount is " +  tax );
   } 
}
