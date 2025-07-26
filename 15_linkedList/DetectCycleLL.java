class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycleLL {
    public static Node head;

    
    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // +1 
            fast = fast.next.next;      // +2 

            if (slow == fast) {
                return true;  // cycle 
            }
        }

        return false;  // no cycle
    }

    public static void main(String[] args) {
        // Create LL
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        //  cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;  

        System.out.println(isCycle(head));

    }
        
}
