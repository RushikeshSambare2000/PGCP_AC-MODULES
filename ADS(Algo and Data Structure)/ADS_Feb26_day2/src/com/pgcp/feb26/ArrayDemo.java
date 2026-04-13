package com.pgcp.feb26;

public class ArrayDemo {
	static int arr [] = new int[10];
	
	public static void insert(int position, int value) {
		
		if(position < 10 && position >= 0) {
			arr[position] = value;
		}
		
	}
	
	public static void delete(int value) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == value) {
					arr[i]=0;
				}
			}
			
	}
	
	public static void display() {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		insert(5,50);
		display();
		System.out.println();
		delete(50);
		display();	

	}

}
