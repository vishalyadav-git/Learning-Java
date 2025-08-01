class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseDoublyLL{
    Node head, tail;

    // Add at  end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print list forward
    public void print() {
        Node temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the LL
    public void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // Swap next and prev
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // Move to the next node (which is curr.prev now)
            curr = curr.prev;
        }

        // After loop, temp points to the old head previous (which is new head)
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);

        dll.print();         
        dll.reverse();
        dll.print();         
    }
}
