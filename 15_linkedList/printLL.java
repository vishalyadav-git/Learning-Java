class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class printLL {
    public static Node head;

    // Function to print the linked list
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
        
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head = first;
        first.next = second;
        second.next = third;

        printList(); 
    }
}


