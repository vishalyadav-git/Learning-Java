class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntro {
    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link nodes
        head.next = second;
        second.next = third;

        // Print the list
        printList(head);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
