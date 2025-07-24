class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListRemoveNth {
    public static Node head;

    // Function to remove nth node from end
    public static void removeNthFromEnd(int n) {
        // Step 1: count size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: if n == size, remove head
        if (n == size) {
            head = head.next;
            return;
        }

        // Step 3: go to (size - n - 1)th node
        int i = 1;
        Node prev = head;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }

        // Step 4: remove the nth node
        prev.next = prev.next.next;
    }

    // Print the linked list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList();

        int n = 2;
        removeNthFromEnd(n);

        System.out.println("After removing " + n + "th node from end:");
        printList();
    }
}

