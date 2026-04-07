class ScopeDemo
{
	public static void main(String args[])
	{
		{
			int a = 5;
			{
				int b = 10;
				System.out.println(a);
				System.out.println(b);	
			}
			System.out.println(a);		
			//System.out.pritln(b);		//Compilation Error
		}
		//System.out.println(a);		//Compilation Error
	}
}
