//import java.util.Scanner;

class TwoDimArrayDemo
{
	public static void main(String args[])
	{
	
		//Scanner  sc = new Scanner(System.in);
		
		int arr[][] = {{5,10},{15,20},{25,30}};		//2D Array with 3 rows and 2 columns
		
		System.out.println("2D Array elements: ");
		
		for(int i = 0; i < 3; i++)		//rows
		{
			for(int j = 0; j < 2; j++)	//cols
			{
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
		int [] ar1,ar2,ar3 = new int[3];
		
		System.out.println("Array elements:");
		for(int i = 0; i < 3; i++)
		{
			System.out.println(ar3[i]);
		}
		
	}
}
