import java.util.Arrays;

public class insertionSort {
    public static void sort(int num[]){
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            while (prev>=0 && num[prev] > curr) {
                num[prev+1] = num[prev];
                prev--;
            }
            // insertion
            num[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,6,4,1,5};
        System.out.println("Original Array: " + Arrays.toString(num));
        sort(num);
        System.out.println("Sorted Array: " + Arrays.toString(num));
       
       
    }
}
