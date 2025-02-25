import java.util.*;
public class reverseAndStoreNum {
    public static void main(String args[]){
        int num = 21082004;
        int lastDigit = 0;
        int reverse = 0;
        while(num > 0){
            lastDigit = num % 10;
            reverse =( reverse*10) + lastDigit;
            num = num/10;

        }
        System.out.println( "Reverse of number is: " + reverse);

    }
}
