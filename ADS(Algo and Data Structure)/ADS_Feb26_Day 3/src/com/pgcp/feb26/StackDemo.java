package com.pgcp.feb26;

public class StackDemo {
	int max = 5;
	int stack[] = new int[max];
	int top = -1;
	
	
	
	boolean isFull() { return top == max -1 ; }
	
	boolean isEmpty() { return top == -1; }
	
	void push(int a) {
		//if(top == max-1) {
		if (isFull()) {
			System.out.println("Stack Overflow...!!");
		}
		else {
			top++;
			stack[top] = a;
			System.out.println("Value "+ a +" added to stack");
		}
	}
	
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow...!!");
		}else {
			System.out.println(stack[top] +" removed from stack");
			top--;
		}
	}

	void peek() {
		if(top==-1) {
			System.out.println("Stack is empty...!!");
		}else {
			System.out.println(stack[top] +" is at the top of the stack.");
		
		}
	}
	
	
	void display() {
		
		if(top == -1) {
			System.out.println("Stack is empty...!!");
		}
		else {
			System.out.println("Stack elements :");
			for(int i = top; i>=0; i--) {
				System.out.print(stack[i]+" ");
				
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		StackDemo s = new StackDemo();
		
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.display();
	//s.push(60);	
	s.pop();
	s.push(60);
//	s.pop();
//	s.pop();
//	s.pop();
//	s.pop();
	//s.pop();
//	s.pop();
//	s.pop();
	//s.peek();

	}

}
