import java.util.*;
public class CirculerQueue {
    int max = 5;
    int[] queue = new int[max];
    int front = -1;
    int rear = -1;
   

    boolean isfull(){
        return(front == 0 && rear==max-1)||(rear+1==max);
    }

    boolean isEmpty(){
        return front ==-1;
    }
    void enqueue(int a) {
        if (isfull()) {
            System.out.println("CirculerQueue overflow...");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear=0;
        }else if (rear == max - 1) {
            rear = 0;
        } else {
            rear++;
        }
        queue[rear] = a;
        System.out.println(a + " Added i CirculerQueue");
    }

    int dqueue() {
        if(isEmpty()){
            System.out.println("CirculerQueue underflow..");
            return -1;
        }
        int removed = queue[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == max - 1) {
            front = 0;
        } else {
            front++;
        }

        return removed;
    }

    void display(){
         if(front==-1){
            System.out.println("CirculerQueue empty");
            return;
        }
         System.out.print("Circular queue elements: ");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % max;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CirculerQueue cq = new CirculerQueue();
       while (true) {
            System.out.println("\nCircular Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    cq.enqueue(value);
                    break;
                case 2:
                    int removed = cq.dqueue();
                    if (removed != -1) {
                        System.out.println(removed + " removed from circular queue");
                    }
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

