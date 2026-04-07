class ConditionalStatementDemo
{
	public static void main(String args[])
	{
		int x = 5;
		int y = 3;
		int z = 7;
		
		if(x > y)
		{
			System.out.println("x is greater");
		}
		else
		{
			System.out.println("y is greater");
		}
		
		if(true)
		{
			System.out.println("Finally we reached!!");
		}
		
		//Finding the largest among three numbers
		if(x > y && x > z)
		{
			System.out.println("x is largest");
		}
		else if(y > z)
		{
			System.out.println("y is largest");
		}
		else
		{
			System.out.println("z is largest");
		}
		
	}
}
