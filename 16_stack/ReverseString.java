import java.util.*;
public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of string into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters from stack 
        StringBuilder reversed = new StringBuilder("");
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "vishal";
        String result = reverse(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
}
