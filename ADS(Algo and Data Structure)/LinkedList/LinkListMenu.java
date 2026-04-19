import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // 1. Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 2. Delete by value (first occurrence)
    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Node deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Node deleted.");
        }
    }

    // 3. Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // 4. Display middle element
    void displayMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }
}

public class LinkListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, value;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at End");
            System.out.println("2. Delete by Value");
            System.out.println("3. Display List");
            System.out.println("4. Display Middle Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insertAtEnd(value);
                    System.out.println("Node inserted.");
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    list.deleteByValue(value);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    list.displayMiddle();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}