import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
     public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty no NGE
            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        // Print result
        System.out.println(Arrays.toString(nge));
    }
}
