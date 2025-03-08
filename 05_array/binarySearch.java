import java.util.*;



public class binarySearch {
    public static int search(int number[], int key){
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
    
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,12,23,45,67,89};
        int key = 23;
        System.out.println("index of element: " +search(number, key));
    }
}
