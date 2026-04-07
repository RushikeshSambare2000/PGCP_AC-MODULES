class BreakContinueDemo
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			if(i > 5) 
			{
				break;
			}		
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.println(j);
				if( i == j)
				{
					break;		//It will come out from inner loop
				}
			}
			System.out.println("Out of inner loop"); 
		}
		System.out.println("Out of outer loop");
		
		
		
		System.out.println("Labelled break");
		
		outer: for(int i = 1; i <= 5; i++)
		{
			inner: for(int j = 1; j <= 5; j++)
			{
				System.out.println(j);
				if( i == j)
				{
					break outer;		//It will come out from inner loop
				}
			}
			System.out.println("Out of inner loop"); 
		}
		System.out.println("Out of outer loop");
		
		System.out.println("Use of continue");
		for(int i = 1; i <= 10; i++)
		{
			if(i > 5) 
			{
				continue;
			}
			System.out.println(i);			
		}
		
		System.out.println("Use of labelled continue");
		outer: for(int i = 1; i <= 5; i++)
		{
			inner: for(int j = 1; j <= 5; j++)
			{
				System.out.println(j);
				if( i == j)
				{
					continue outer;		//It will come out from inner loop
				}
			}
			System.out.println("Out of inner loop"); 
		}
		System.out.println("Out of outer loop");
	}
}
	
