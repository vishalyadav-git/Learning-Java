import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
      static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push element into stack
        public static void push(int data) {
            //  Put new data in q2
            q2.add(data);

            // Move all elements of q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            //  Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop element from stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // Peek element from stack
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek()); 
        System.out.println(s.pop()); 
        System.out.println(s.peek()); 
        System.out.println(s.pop());  
        System.out.println(s.pop());  
    }
}
