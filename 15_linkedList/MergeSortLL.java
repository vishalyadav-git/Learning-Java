class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLL {
    public static Node head;

    // Main function to apply Merge Sort
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        //  Divide into left and right
        Node rightHead = mid.next;
        mid.next = null;

        Node leftSorted = mergeSort(head);
        Node rightSorted = mergeSort(rightHead);

        //  Merge
        return merge(leftSorted, rightSorted);
    }

    // Find middle node
    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //  Merge two sorted lists
    private static Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }

    // Print LL
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   
    public static void main(String[] args) {
        head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted List: ");
        printList(head);
    }
}
