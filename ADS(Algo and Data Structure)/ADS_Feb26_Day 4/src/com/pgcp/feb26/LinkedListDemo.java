package com.pgcp.feb26;

public class LinkedListDemo {

	private static class Node{
		int data;
		
		Node next;	
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	void insertAtEnd(int value) {
		
		Node newNode = new Node(value);
		
		if (head == null) {
			head = newNode;
			return ; 
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		
		
	}
	void insertAtBeginning(int value) {
	        Node newNode = new Node(value);
	        newNode.next = head;
	        head = newNode;
	      
	}
	
	
	 void insertAtPosition(int value, int position) {
	        if (position <= 1 || head == null) {
	            insertAtBeginning(value);
	            return;
	        }

	        Node current = head;
	        int pos = 1;
	        while (current.next != null && pos < position - 1) {
	            current = current.next;
	            pos++;
	        }

	        Node newNode = new Node(value);
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	
	 	 
	 int deleteAtBeginning() {
	        if (head == null) {
	            System.out.println("Linked list is empty");
	            return -1;
	        }

	        int removed = head.data;
	        head = head.next;
	        return removed;
	    }
	 
	 int deleteAtEnd() {
	        if (head == null) {
	            System.out.println("Linked list is empty");
	            return -1;
	        }

	        if (head.next == null) {
	            int removed = head.data;
	            head = null;
	            return removed;
	        }

	        Node current = head;
	        while (current.next.next != null) {
	            current = current.next;
	        }

	        int removed = current.next.data;
	        current.next = null;
	        return removed;
	    } 
	 
	 boolean deleteByValue(int value) {
	        if (head == null) {
	            return false;
	        }

	        if (head.data == value) {
	            head = head.next;
	            return true;
	        }

	        Node current = head;
	        while (current.next != null && current.next.data != value) {
	            current = current.next;
	        }

	        if (current.next == null) {
	            return false;
	        }

	        current.next = current.next.next;
	        return true;
	    } 
	 
	 
	 boolean search(int value) {
	        Node current = head;

	        while (current != null) {
	            if (current.data == value) {
	                return true;
	            }
	            current = current.next;
	        }

	        return false;
	    }
	 
	 
	 void reverse() {
	        Node previous = null;
	        Node current = head;

	        while (current != null) {
	            Node nextNode = current.next;
	            current.next = previous;
	            previous = current;
	            current = nextNode;
	        }

	        head = previous;
	    }
	  
	void display() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node current = head;
		System.out.println("Linked List Node Data :");
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}		
	}

	public static void main(String[] args) {
		
		LinkedListDemo l = new LinkedListDemo();
		
		l.insertAtEnd(10);  // position 1
		l.insertAtEnd(20);  // position 2
		l.insertAtEnd(30);  // position 3
		l.insertAtEnd(40);  // position 4 
		
		//l.insertAtBeginning(50);
		
		//l.insertAtPosition(1000, 3);
		
		//l.insertAtBeginning(60);
		
		//System.out.println(l.deleteAtBeginning());
		//System.out.println(l.deleteAtEnd());
		
//		if(l.search(30)) {
//			System.out.println("Data Found");
//		}else {
//			System.out.println("Data Not Found....");
//		}
		
		
		l.display();
		System.out.println("Linked List Reverse");
		l.reverse();
		l.display();
		
		
		l.insertAtBeginning(1000);
		
		l.display();
		
		
		//System.out.println(null == null ); true
		//System.out.println(null != null ); false		
	}

}
