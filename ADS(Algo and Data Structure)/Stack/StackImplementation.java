public class StackImplementation {
    int max = 5;
    int top = -1;
    int stack[] = new int[max];

    void push(int a) {
        if (top == max - 1) {
            System.out.println("Stack overflow..");
        } else {
            top++;
            stack[top] = a;
             System.out.println(stack[top]+" add to the  stack ");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            top--;
            System.out.println(stack[top]+" removed from stack ");
        }

    }

    void peak(){
        if(top==-1){
            System.out.println("Stack is empthy");
        }else{
            System.out.println(stack[top]+" is at the top of the stack");
        }
    }


    void display(){
        if(top==-1){
            System.out.println("Stack is empthy");
        }else{
            System.out.println("Stack elements : ");
            for(int i=top; i>=0; i--){
                System.out.println(stack[i]+" ");
            }
        }
    }

    // boolean isfull(){return top ==max-1;}
    // boolean isEmpty(){return top ==-1;}

    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        // s.push(10);
        s.pop();
        s.push(20);

        s.peak();
        s.display();

    }
}
