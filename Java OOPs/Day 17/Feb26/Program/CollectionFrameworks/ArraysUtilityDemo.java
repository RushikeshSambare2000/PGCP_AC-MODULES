import java.util.*;

class ArraysUtilityDemo
{
	static <T> void display(T arr[])
	{
		for(T val : arr)
		{
			System.out.println(val);
		}
	}
	public static void main(String args[])
	{
		int arr1[] = {10,15,5,12,9};
		
		System.out.println("Array elements:");
		for(int v : arr1)
		{
			System.out.println(v);
		}
		
		//sort()
		Arrays.sort(arr1);
		
		System.out.println("After Arrays.sort(arr1):");
		for(int v : arr1)
		{
			System.out.println(v);
		}
		
		//toString()  : String representation of an Array
		System.out.println("Ouput of Arrays.toString(arr1):");
		//String arrAsStr = Arrays.toString(arr1);	//return "[5, 9, 10, 12, 15]"
		//System.out.println(arrAsStr);
		System.out.println(Arrays.toString(arr1));
		
		
		//binarySearch() method
		Arrays.sort(arr1);			//In place sorting
		int idx = Arrays.binarySearch(arr1,12);	//returns the index of the found element
							//in the sorted array
		System.out.println("Arrays.binarySearch(arr1,12): " + idx);
		
		idx = Arrays.binarySearch(arr1,2);		//returns some -ve value if not found
		System.out.println("Arrays.binarySearch(arr1,16): " + idx);
		if(idx < 0)
		{
			System.out.println("element not found");
		}
		
		//equals() method
		int arr2[] = {10,15,5,12,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean bl = Arrays.equals(arr1,arr2);		//Both array must be sorted first.
		System.out.println("Arrays.equals(arr1,arr2): " + bl);
		
		//fill() method
		int arr3[] = new int[5];
		System.out.println("arr3 elements: " + Arrays.toString(arr3));
		
		Arrays.fill(arr3,-1);
		System.out.println("arr3 elements after Arrays.fill(arr3,-1): " + Arrays.toString(arr3));
		
		//copyOf() method
		int arr4[] = Arrays.copyOf(arr2,10);	// [5, 9, 10, 12, 15, 0, 0, 0, 0, 0]
		System.out.println("arr4 elements after Arrays.copyOf(arr2,10):");
		System.out.println(Arrays.toString(arr4));
		
		//asList() method
		Integer arr5[] = {10,15,5,12,9};
		
		List<Integer> list1 = Arrays.asList(arr5);
		
		System.out.println("list1 after Arrays.asList(arr5):");
		for(Integer val : list1)
		{
			System.out.println(val);
		}
		
		//Array --> List (Backed)
		
		arr5[3] = 18;
		
		System.out.println("list1 after arr[3] = 18:");
		for(Integer val : list1)
		{
			System.out.println(val);
		}		
	}
}
