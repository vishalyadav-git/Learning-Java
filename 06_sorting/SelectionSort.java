import java.util.*;

public class SelectionSort {
    public static void sort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            int minValue = i; // Index of the smallest element
            for (int j = i + 1; j < number.length; j++) {
                if (number[minValue] > number[j]) {
                    minValue = j; // Update index of the minimum element
                }
            }
            // Swap the found minimum element with the first element
            int temp = number[minValue];
            number[minValue] = number[i];
            number[i] = temp;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 7, 5, 3};

        System.out.println("Original Array: " + Arrays.toString(number));

        sort(number); // Calling selection sort function

        System.out.println("Sorted Array: " + Arrays.toString(number));
    }
}
