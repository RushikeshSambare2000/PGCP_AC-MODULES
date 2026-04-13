package com.pgcp.feb26;

public class SearchingDemo {
	
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
	
	static int binarySearch(int arr[], int key) 
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
          
            int mid = start + (end - start) / 2; 
            if (arr[mid] == key)   //50==70
                return mid;
            else if (arr[mid] < key) { // 50 < 70
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
       
        return -1;
    }


	public static void main(String[] args) {
		
		//int[] arr1= {11, 12, 91, 10,20,30,50,70,30};    
		int[] arr1= {10,20,30,50,70}; 
	   int key = 91;    
	   // System.out.println(key+" is present and is found at index: "+linearSearch(arr1, key));    
		 int index = binarySearch(arr1, key);
	        if (index == -1) {
	            System.out.println("key element not found");
	        }
	        else {
	            System.out.println("key element found at index :" + index);
	        }

	}

}




//int[] arr1= {10,20,30,50,70}; 

