import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingDeque {
     static class Queue {
        Deque<Integer> dq = new ArrayDeque<>();

        // add 
        public void add(int data) {
            dq.addLast(data);
        }

        // remove 
        public int remove() {
            if (dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        // peek 
        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.getFirst();
        }

        // isEmpty
        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front element: " + q.peek()); 
        System.out.println("Removed: " + q.remove());     
        System.out.println("Removed: " + q.remove());     
        System.out.println("Front element: " + q.peek()); 
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
