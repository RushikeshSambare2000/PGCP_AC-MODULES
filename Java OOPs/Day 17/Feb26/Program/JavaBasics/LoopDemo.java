class LoopDemo
{
	public static void main(String args[])
	{
		System.out.println("Using while loop");
		int i = 1;		//initialization
		while (i <= 10)		//condition
		{
			System.out.println(i);
			i++;		//increment
		}


		System.out.println("Using do-while loop");
		i = 1;		//initialization
		do
		{
			System.out.println(i);
			i++;		//increment
		} while (i <= 10);	//condition

		

		System.out.println("Using for loop");
		for(i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		/*for(; ;)			//infinite loop
		{
			System.out.println("hi");
		}*/
		
		
	}
}
