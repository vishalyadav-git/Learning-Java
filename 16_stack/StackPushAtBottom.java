import java.util.*;
public class StackPushAtBottom {
     // Recursive function to push at bottom
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();              
        pushAtBottom(stack, data);          
        stack.push(top);                   
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 0);

    
        System.out.println("Stack after pushing at bottom:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
