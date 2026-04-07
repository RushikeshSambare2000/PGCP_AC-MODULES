class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}


class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program starts ...");
		int age = 15;
		
		try
		{
			
			
			if(age < 18)
			{
				//throw new ArithmeticException("Age is less than 18");
				MyException me = new MyException("Age criteria failed, voter id can not be issued!!");
				throw me;
				
				// throw new MyException("Age criteria failed, voter id can not be issued!!");
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught: "+e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Program execution completed successfully!");
		
	}
}
