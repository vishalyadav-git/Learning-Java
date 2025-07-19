class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LLAddLast {
    public static Node head;

    // Function to add node at the end
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Function to print the list
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
        addLast(10);
        addLast(20);
        addLast(30);

        printList();  
} 

}

