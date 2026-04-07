import java.io.*;

class Demo
{
	void myFun()
	{
		System.out.println("myFun of Demo");
	}
	
}

class CheckedUncheckedDemo
{
	public static void main(String args[])
	{
		System.out.println("Program starts ...");
		int age = 15;
		
		Demo d = new Demo();
		d = null;
		
		try
		{
			d.myFun();
			
			if(age < 18)
			{
				//FileReader fr = new FileReader("/home/shivnath/");
				throw new ArithmeticException("Age is less than 18!!");	//Unchecked
			}
			
			if(age < 18)
			{
				//FileReader fr = new FileReader("/home/shivnath/");
				throw new IOException("Not eligible to vote!!");	//Checked
			}
		}
		catch(IOException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("Program execution completed successfully.");
	}
}
