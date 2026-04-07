import java.util.Scanner;

class TwoDimArrayUserInputDemo
{
	public static void main(String args[])
	{
		Scanner  sc = new Scanner(System.in);
		
		int arr[][];
		int rows;
		int cols;
		
		System.out.println("Enter no. of rows: ");
		rows = sc.nextInt();
		
		System.out.println("Enter no. of columns: ");
		cols = sc.nextInt();
		
		arr = new int[rows][cols];
		
		//Reading input from the user (keyboard)
		
		System.out.println("Enter values");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2D Array elements are: ");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
}
