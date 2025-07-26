 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveCycleLL {
    public static Node head;

    // Detect and remove cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            System.out.println("No cycle to remove.");
            return;
        }

        // Step 2: Find start of the cycle
        slow = head;
        Node prev = null;  // to keep track of last node in cycle

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle
        prev.next = null;
        System.out.println("Cycle removed.");
    } 
    public static void main(String[] args) {
       
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle
        head.next.next.next.next.next = head.next.next;
        System.out.println("Cycle exists: " + DetectCycleLL.isCycle(head));
        removeCycle();
        System.out.println("Cycle exists after removal: " + DetectCycleLL.isCycle(head));
  }
}