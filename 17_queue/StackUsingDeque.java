import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> dq = new ArrayDeque<>();

        // push operation
        public void push(int data) {
            dq.addLast(data);
        }

        // pop operation
        public int pop() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        // peek operation
        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
        }

        // isEmpty
        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element: " + s.peek()); 
        System.out.println("Popped: " + s.pop());       
        System.out.println("Popped: " + s.pop());       
        System.out.println("Top element: " + s.peek()); 
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
