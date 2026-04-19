public class CircularQueueuImplentationLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node rear = null;

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            rear = newNode;
            rear.next = rear;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if (rear == null) {
            System.out.println("Queue Underflow");
            return;
        }

        Node front = rear.next;

        if (rear == front) {
            System.out.println(front.data + " removed");
            rear = null;
        } else {
            System.out.println(front.data + " removed");
            rear.next = front.next;
        }
    }

    void display() {
        if (rear == null) return;

        Node temp = rear.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != rear.next);

        System.out.println();
    }

    public static void main(String[] args) {
         CircularQueueuImplentationLinkedList q = new  CircularQueueuImplentationLinkedList();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.display();

        q.dequeue();
        q.display();
    }
}

