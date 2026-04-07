class SwitchCaseDemo
{
	public static void main(String args[])
	{
		int ch = 5;
		
		switch(ch)
		{
			default:
				System.out.println("Default");
				break;
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				System.out.println("Hi");
				//break;
			case 3:
				System.out.println("Case 3");
				//break;
			case 4:
				System.out.println("Case 4");
				break;	
		}
		
		
		char choice = 'a';
		
		switch(choice)
		{
			case 'a':
			case 'A':
				System.out.println("Case A");
				break;
			case 'b':
			case 'B':
				System.out.println("Case B");
				break;
			case 'c':
			case 'C':
				System.out.println("Case C");
				break;	
			default:
				System.out.println("Default for second switch");	
		}
		
		System.out.println("Out of switch-case");
		
	}
}
