import java.util.Queue;

public class queuedemo {
    int max = 5;
    int[] queue = new int[max];
    int front = -1;
    int rear = -1;

    void enqueue(int a) {
        if (rear == max - 1) {
            System.out.println("Queue overflow...");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = a;
        System.out.println(a + " Added i queue");
    }

    int dquwue() {
        if(front==-1){
            System.out.println("Queue underflow..");
        }
        int removed = queue[front++];

        if(front>rear){
            front=-1;
            rear=-1;
        }
        return removed;
    }

    void display(){
        System.out.println("Queue Elements : ");
        for(int i =front; i<=rear; i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        queuedemo q = new queuedemo();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        // q.enqueue(40); // Queue overflow...

        System.out.println(q.dquwue() + "Removed from queue");
        System.out.println(q.dquwue() + "Removed from queue");
        System.out.println(q.dquwue() + "Removed from queue");
        System.out.println(q.dquwue() + "Removed from queue");
        System.out.println(q.dquwue() + "Removed from queue");
            // System.out.println(q.dquwue() + "Removed from queue");
         q.enqueue(50);
         
         q.display();
    }
}