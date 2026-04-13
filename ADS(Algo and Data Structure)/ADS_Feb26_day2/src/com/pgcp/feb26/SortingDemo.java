package com.pgcp.feb26;

public class SortingDemo {

	 public static void bubbleSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i ; j++) {
	            	//System.out.println("J "+j);
	                if (arr[j] > arr[j + 1]) {// 5>2 , 5>9, 9>1, 9>6
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	
	  public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	
	  public static void insertionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 1; i < n; i++) {
	            int key = arr[i];  
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;         }
	    }
	  
	  public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	           for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	public static void main(String[] args) {
			int[] arr = {5, 2, 9, 1, 6};

	        System.out.println("Before Sorting:");
	        printArray(arr);

	       // bubbleSort(arr);
	      //  insertionSort(arr);
	        selectionSort(arr);
	        
	        
	        System.out.println("After Sorting:");
	        printArray(arr);


	}

}
