class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class searchRecursiveLL {
    public static Node head;

    // Recursive search function
    public static int recursiveSearch(Node head, int key) {
        if (head == null) {
            return -1; // Base case
        }
        if (head.data == key) {
            return 0; // Key found 
        }

        int idx = recursiveSearch(head.next, key); 

        if (idx == -1) {
            return -1; 
        } else {
            return idx + 1; 
        }
    }

    // Helper function to print the result
    public static void search(int key) {
        int idx = recursiveSearch(head, key);
        if (idx == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + idx);
        }
    }

    public static void main(String[] args) {
        
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        search(30); 
        search(50); 
    }
}

