import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int val = q.remove();  
        reverse(q);             
        q.add(val);             
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}
