import java.util.*;

public class BubbleSort {
    public static void sort(int number[]) {
        int temp;
        for (int i = 0; i < number.length - 1; i++) {
            boolean swapped = false; // Optimization to stop if already sorted
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swapped = true; // Mark that a swap happened
                }
            }
            // If no swapping happens, array is already sorted
            if (!swapped) break;
        }

        // Print the sorted array after sorting is complete
        System.out.println("Sorted Array: " + Arrays.toString(number));
    }

    public static void main(String[] args) {
        int number[] = {5, 2, 9, 1, 5, 6};
        sort(number);
    }
}
