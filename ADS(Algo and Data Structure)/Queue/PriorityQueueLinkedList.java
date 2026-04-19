public class PriorityQueueLinkedList{
    static class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    Node head = null;

    void enqueue(int value, int priority) {
        Node newNode = new Node(value, priority);

        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(head.data + " removed");
        head = head.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("(" + temp.data + ", p=" + temp.priority + ") ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();

        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);

        pq.display();

        pq.dequeue();
        pq.display();
    }
}

