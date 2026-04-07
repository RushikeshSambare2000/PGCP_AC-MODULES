class First
{
	int a = 10;
	private static First fobj;
	
	private First()
	{
		
	}
	
	static First getInstance()
	{
		//return singleton First object
		if(fobj == null)
			fobj = new First();
		
		return fobj;
	}
	
	void print()
	{
		System.out.println(a);
	}	
}


class SingletonDemo
{
	pf1ublic static void main(String args[])
	{
		First f1 = First.getInstance();
		First f2 = First.getInstance();	
		
		f1.print();
		f2.print();
		f1.a = 15;
		f1.print();
		f2.print();
	}
}


