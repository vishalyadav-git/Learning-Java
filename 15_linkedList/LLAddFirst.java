class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LLAddFirst {
    
    public static Node head;

    // Function to add at first
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;       
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
        addFirst(10);
        addFirst(20);
        addFirst(30);

        printList();  
    }
}
