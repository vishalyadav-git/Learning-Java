import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
     public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // 1: push all elements from queue to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // 2: pop all elements from stack to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}
