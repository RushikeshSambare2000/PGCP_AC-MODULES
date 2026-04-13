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

	  
	  
	  static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;
	            mergeSort(arr, left, mid);      
	            mergeSort(arr, mid + 1, right);  
	            merge(arr, left, mid, right);    
	        }
	    }

	    static void merge(int[] arr, int left, int mid, int right) {
	        int[] temp = new int[right - left + 1];
	        int i = left;      
	        int j = mid + 1;   
	        int k = 0;
	        while (i <= mid && j <= right) {
	            if (arr[i] < arr[j]) { 
	                temp[k++] = arr[i++];
	            } else {
	                temp[k++] = arr[j++];
	            }
	        }
	        while (i <= mid) {
	            temp[k++] = arr[i++];
	        }

	        while (j <= right) {
	            temp[k++] = arr[j++];
	        }

	        for (int x = 0; x < temp.length; x++) {
	            arr[left + x] = temp[x];
	        }
	    }


	    
	    
	    
	    
	  
	  
	public static void main(String[] args) {
			int[] arr = {5, 2, 9, 1, 6};

	        System.out.println("Before Sorting:");
	        printArray(arr);

	    //    bubbleSort(arr);
	    
	      //  insertionSort(arr);
	        
	  
	        //selectionSort(arr);
	        
	        mergeSort(arr,0,4);  
	      
	        System.out.println("After Sorting:");
	        printArray(arr);


	}

}
















