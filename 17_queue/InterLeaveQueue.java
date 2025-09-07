import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveQueue {
     public static void interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue must have even number of elements");
            return;
        }

        int n = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        //1. Store first half in another queue
        for (int i = 0; i < n/2; i++) {
            firstHalf.add(q.remove());
        }

        //2: Interleave both halves
        while (!firstHalf.isEmpty()) {
            // add from first half
             q.add(firstHalf.remove());
            // add from second half
             q.add(q.remove()); 
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);
        interleave(q);
        System.out.println("Interleaved Queue: " + q);
    }
}
