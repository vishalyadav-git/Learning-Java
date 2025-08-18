import java.util.*;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // add elements
        q.add(1);
        q.add(2);
        q.add(3);

        // print & remove elements
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // front element
            q.remove(); // dequeue
        }
    }
}
