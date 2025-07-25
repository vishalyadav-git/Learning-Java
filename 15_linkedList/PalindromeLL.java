class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLL {
    public static Node head;

    // Find middle of list
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // +1
            fast = fast.next.next;   // +2
        }

        return slow;  // middle node
    }

    // Reverse the list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // new head
    }

    //  Check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        //  Find mid
        Node mid = findMid(head);

        //  Reverse second half
        Node secondHalfStart = reverse(mid);

        //  Compare
        Node firstHalf = head;
        Node secondHalf = secondHalfStart;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
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
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        printList();

        if (isPalindrome(head)) {
            System.out.println("Linked List is a Palindrome");
        } else {
            System.out.println("Linked List is NOT a Palindrome");
        }
    }
}
