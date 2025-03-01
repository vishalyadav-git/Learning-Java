import java.util.*;

public class binToDec {
    public static void conversion(int binNum){
        int value = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow ));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " +value + " = " + decNum);
    }

    public static void main(String[] args) {
        conversion(1001);
    }
}
