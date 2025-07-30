class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ZigZagLL {
    public static Node head;

    //Find middle
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //  Reverse second half
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    //  ZigZag merge
    public static void zigZag(Node head) {
        // Find mid
        Node mid = findMid(head);

        // Reverse second half
        Node secondHalf = reverse(mid.next);
        mid.next = null;

        // Alternate merge
        Node first = head;
        Node temp;

        while (first != null && secondHalf != null) {
            Node next1 = first.next;
            Node next2 = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = next1;

            first = next1;
            secondHalf = next2;
        }
    }

    // Printing LL
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        zigZag(head);

        System.out.println("Zig-Zag List:");
        printList(head);
    }
}
