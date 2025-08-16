public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enqueue → add at tail
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) { // empty queue
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue  remove from head
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) { // only one element
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek  front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

