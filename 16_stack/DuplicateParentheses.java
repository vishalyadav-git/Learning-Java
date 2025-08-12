import java.util.Stack;

public class DuplicateParentheses {
     public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If not closing bracket push it
            if (ch != ')') {
                s.push(ch);
            } else {
                // Count elements inside the parenthesis
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Pop the opening '('
                if (!s.isEmpty()) {
                    s.pop();
                }

                // If there were no elements between () its duplicate
                if (count < 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a+(b))";
        String str3 = "(a+b)";

        System.out.println(isDuplicate(str1)); 
        System.out.println(isDuplicate(str2)); 
        System.out.println(isDuplicate(str3)); 
    }
}
