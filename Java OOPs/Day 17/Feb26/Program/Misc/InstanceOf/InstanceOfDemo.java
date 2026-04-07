class First
{
}

class Second extends First
{
}

class Third
{
}

class InstanceOfDemo
{
	public static void main(String args[])
	{
		//instanceof operator
		First f1 = new First();
		
		if(f1 instanceof First)
		{
			System.out.println("f1 is the instance of First");
		}
		else
		{
			System.out.println("f1 is not an instance of First");
		}
		
		Second s1 = new Second();
		if(s1 instanceof Second)		//true
		{
			System.out.println("s1 is the instance of Second");
		}
		else
		{
			System.out.println("s1 is not an instance of Second");
		}
		
		
		if(s1 instanceof First)			//true
		{
			System.out.println("s1 is the instance of First");
		}
		else
		{
			System.out.println("s1 is not an instance of First");
		}
		
		
		f1 = new Second();
		
		if(f1 instanceof Second)
		{
			System.out.println("f1 is the instance of Second");
		}
		else
		{
			System.out.println("f1 is not an instance of Second");
		}
			
	}
}
