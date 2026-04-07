class First
{
	int a;
	Second s;
	
	First(int a)
	{
		this.a = a;
	}
	
	protected void finalize()
	{
		System.out.println("finalize called for First class object");
	}
	
}

class Second
{
	int b;
	First f;
	
	Second(int b)
	{
		this.b = b;
	}
	
	protected void finalize()
	{
		System.out.println("finalize called for Second class object");
	}
	
}

class IslandOfIsolationDemo
{
	public static void main(String args[])
	{
		First f1 = new First(5);
		Second s1 = new Second(10);
		
		f1.s = s1;
		s1.f = f1;
		
		f1 = null;
		s1 = null;
		
		//System.gc()
		Runtime.getRuntime().gc();
	}
}
