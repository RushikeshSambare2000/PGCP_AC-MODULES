class MergeLinkedLists {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted lists
    static Node mergeLists(Node head1, Node head2) {

        Node dummy = new Node(-1); // dummy node
        Node tail = dummy;

        Node p1 = head1;
        Node p2 = head2;

        // Merge while both lists have nodes
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                tail.next = new Node(p1.data); // create new node
                p1 = p1.next;
            } else {
                tail.next = new Node(p2.data);
                p2 = p2.next;
            }
            tail = tail.next;
        }

        // Copy remaining elements of List 1
        while (p1 != null) {
            tail.next = new Node(p1.data);
            tail = tail.next;
            p1 = p1.next;
        }

        // Copy remaining elements of List 2
        while (p2 != null) {
            tail.next = new Node(p2.data);
            tail = tail.next;
            p2 = p2.next;
        }

        return dummy.next; // return head of merged list
    }

    // Utility function to print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function
    public static void main(String[] args) {

        // List 1: 1 → 3 → 5 → 7
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        // List 2: 2 → 4 → 6 → 8
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node mergedHead = mergeLists(head1, head2);

        System.out.print("Merged List: ");
        printList(mergedHead);
    }
}