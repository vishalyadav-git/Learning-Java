    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMidInsert {
    public static Node head;
    public static Node tail;

    // Add at first
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at last
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add at specific index (in the middle)
    public static void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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

    // Main function
    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(4);
        addLast(5);
        System.out.println("Before inserting in the middle:");
        printList();

        addAtIndex(2, 3);

        System.out.println("After inserting 3 at index 2:");
        printList();
    }
}


