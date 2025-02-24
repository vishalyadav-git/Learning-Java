import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();
        int avg = (num1 + num2 + num3)/3;
        System.out.println(avg);
    }
}
