class ExceptionHandlingDemo
{
	public static void myAnotherFun()
	{
		try
		{
			int res = 5/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void myFun()
	{
		myAnotherFun();
	}
	public static void main(String args[])
	{
		
		System.out.println("Program execution starts ...");
		int a = 10;
		int b = 5;
		int res;
		
		int arr[] = {5,10,15};
		try
		{
			myFun();
			//System.exit(0);
			//if(true) return;
			
			//open database connection
			res = a/b;		//ArithmeticException
			System.out.println(res);
			
			System.out.println(arr[3]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught here");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught here");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here");
		}
		catch(Exception e)		//catch-all handler
		{
			System.out.println("An Exception caught here");
		}
		finally
		{
			System.out.println("finally block");
			//close database connection
		}
	
		
		System.out.println("Program execution completed successfully");
	}
}
