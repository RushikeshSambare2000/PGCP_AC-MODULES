public class StackImplementationn<T> {
    int max = 5;
    int top = -1;
    T stack[] = (T[]) new Object[max]; // generic array

    void push(T a) {
        if (top == max - 1) {
            System.out.println("Stack overflow..");
        } else {
            top++;
            stack[top] = a;
            System.out.println(stack[top] + " added to the stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(stack[top] + " removed from stack");
            top--; // FIX: print first, then decrement
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top] + " is at the top of the stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Integer Stack
        StackImplementationn<Integer> s1 = new StackImplementationn<>();
        s1.push(10);
        s1.push(20);
        s1.pop();
        s1.peek();
        s1.display();

        System.out.println("-----");

        // String Stack
        StackImplementationn<String> s2 = new StackImplementationn<>();
        s2.push("Hello");
        s2.push("World");
        s2.peek();
        s2.display();
    }
}