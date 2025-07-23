class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    public static Node head;

    // Function to reverse the linked list
    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse pointer
            prev = curr;        // move prev ahead
            curr = next;        // move curr ahead
        }

        head = prev; // update head to the last node
    }

    // Function to print linked list
    public static void printList() {
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
        printList();

        reverse();

        System.out.println("Reversed List:");
        printList();
    }
}

