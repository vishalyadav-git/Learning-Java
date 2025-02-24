import java.util.*;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter<=num) {
            sum = sum+counter;
            counter++;
        }
        System.out.println(sum);
    }
}
