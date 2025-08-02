class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLL {
    static Node head = null;
    static Node tail = null;

    // Add node at the end
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular connection
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // maintain circular nature
    }

    // Print circular linked list
    public static void printList() {
        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        System.out.println("Circular Linked List:");
        printList();
    }
}
