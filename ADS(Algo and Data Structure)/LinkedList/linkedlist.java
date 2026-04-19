public class linkedlist {
    private static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.Next != null) {
            current = current.Next;
        }

        current.Next = newNode;
    }

    void insertAtBeginning(int value) {
        Node newnNode = new Node(value);
        newnNode.Next = head;
        head = newnNode;
    }

    void insertAtPosition(int value, int position) {
        if (position <= 1 || head == null) {
            insertAtBeginning(value);
            return;
        }
        Node current = head;
        int index = 1;
        while (current.Next != null && index < position - 1) {
            current = current.Next;
            index++;
        }

        Node newNode = new Node(value);
        newNode.Next = current.Next;
        current.Next = newNode;
    }

    int deleteAtBeginning() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return -1;
        }
        int removed = head.data;
        head = head.Next;
        return removed;
    }

    int deleteAtEnd() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
        }

        if (head.Next == null) {
            int removed = head.data;
            head = null;
            return removed;
        }

        Node current = head;
        while (current.Next.Next != null) {
            current = current.Next;
        }

        int removed = current.Next.data;
        current.Next = null;
        return removed;
    }

    boolean deleteByValue(int value) {
        if (head == null) {
            return false;
        }

        if (head.data == value) {
            head = head.Next;
            return true;
        }

        Node current = head;
        while (current.Next != null && current.Next.data != value) {
            current = current.Next;
        }

        if (current.Next == null) {
            return false;
        }

        current.Next = current.Next.Next;
        return true;
    }

    boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.Next;
        }
        return false;

    }

    void reverse() {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.Next;
            current.Next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.Next;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        // l.display();
        l.insertAtBeginning(50);
        // l.display();
        l.insertAtEnd(30);
        l.insertAtPosition(200, 1);
        l.display();

        if (l.search(30)) {
            System.out.println("Data Found");
        } else {
            System.out.println("Data Not Found....");
        }
    }
}
