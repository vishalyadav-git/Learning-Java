import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements
        dq.addFirst(1); 
        dq.addLast(2);  
        dq.addFirst(0);  
        dq.addLast(3);  

        System.out.println("Deque after insertions: " + dq);

        // Removing elements
        dq.removeFirst(); 
        dq.removeLast();                         

        System.out.println("Deque after removals: " + dq);

        // Peek
        System.out.println("First element: " + dq.getFirst()); 
        System.out.println("Last element: " + dq.getLast());   
    }
}
