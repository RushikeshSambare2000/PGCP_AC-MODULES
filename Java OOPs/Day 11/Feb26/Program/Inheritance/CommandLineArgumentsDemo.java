class CommandLineArgumentsDemo
{
	public static void main(String args[])			//2 Raj Geeta Mohit
	{
		System.out.println("Command line arguments are: ");
		/*for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}*/
		
		
		//Using for-each
		for(String s : args)
		{
			System.out.println(s);
		}	
	}
}
