import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets → push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            else {
                // Closing bracket but stack is empty 
                if (s.isEmpty()) {
                    return false;
                }
                
                // Match the top with the current closing bracket
                char top = s.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false; // Wrong closing bracket
                }
            }
        }
        
        // If stack is empty 
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(isValid(str)); // true

        String str2 = "({[}])";
        System.out.println(isValid(str2)); // false
    }
}
