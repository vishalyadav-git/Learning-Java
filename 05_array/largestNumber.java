import java.util.*;

public class largestNumber {
    public static int search(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        } return largest;
}
    public static void main(String[] args) {
        int number[] = {1,3,5,7,2};
       
        System.out.println("largest value is: " +search(number));
    }
}
