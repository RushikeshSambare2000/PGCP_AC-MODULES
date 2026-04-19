import java.util.Stack;
public class QueueusingTwoStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println(s2.pop() + " removed");
    }

    void display() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = s2.size() - 1; i >= 0; i--) {
            System.out.print(s2.get(i) + " ");
        }

        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueusingTwoStacks q = new QueueusingTwoStacks();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);

        q.display();

        q.dequeue();
        q.display();
    }
}

