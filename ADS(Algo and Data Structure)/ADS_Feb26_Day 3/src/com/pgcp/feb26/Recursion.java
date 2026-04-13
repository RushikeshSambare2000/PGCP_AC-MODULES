package com.pgcp.feb26;

class demoRecurion{
	static void m1() {
		m2();
	}
	static void m2() {
		m1();
	}
	
	static void m3(int a){
		if(a>=0) {
			System.out.println(a--);
			m3(a);
		}else
			System.out.println("else block");
		
	}
	
	static int even(int a) {	
		if(a == 0) {
			return 0;
		}else {
			return 2 + even(a-1);
		}	
	}
	
	static int factorial(int a) {
		if (a == 1 ) {
			return 1;
		}
		else {
			return a * factorial(a-1);
		}
	
	}
	
	static int fibo(int a) {
		if(a == 0 || a == 1) {
			return 1;
		}
		else {
			return(fibo(a-1) + fibo(a-2));
		}
		
	}
	
	// 0 1 1 2 3 5 8 13 21 34 .....
public static void towerOfHanoi(int n, String start, String auxillary,String end) {
			if (n == 1) {
			    System.out.println("Current Disk " + n + ": " + start + " -> "
				    + end);
			} else {
			    towerOfHanoi(n - 1, start, end, auxillary);
			    System.out.println("Current Disk " + n + ": " + start + " -> "
				    + end);
			    towerOfHanoi(n - 1, auxillary, start, end);
			}

}
	
		
}

public class Recursion {

	public static void main(String[] args) {
		//demoRecurion.m1();
		//demoRecurion.m3(5);
		//System.out.println(demoRecurion.even(2));
		//System.out.println(demoRecurion.factorial(5));
		//System.out.println(demoRecurion.fibo(100));
		demoRecurion.towerOfHanoi(10,"A","B","C");
		//2^n - 1
	}

}
