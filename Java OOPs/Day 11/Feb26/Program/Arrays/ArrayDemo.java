import java.util.Scanner;

class ArrayDemo
{
	public static void main(String args[])
	{
	
		Scanner  sc = new Scanner(System.in);
		
		int []arr;
		int size;
		//arr = new int[5];
		
		System.out.println("Enter size of array: ");
		size = sc.nextInt();
		arr = new int[size];
		
		//Input
		System.out.println("Enter values for the array:");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Output
		System.out.println("Array elements are: ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
