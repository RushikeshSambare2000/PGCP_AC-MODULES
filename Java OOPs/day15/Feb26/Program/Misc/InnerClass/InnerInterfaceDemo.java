interface MyInterface
{
	void myFun();
	
	interface MyAnotherInterface
	{
		void anotherFun();
	}
}

class First implements MyInterface
{
	public void myFun()
	{
		System.out.println("First: myFun");
	}
}

class Second implements MyInterface.MyAnotherInterface
{
	public void anotherFun()
	{
		System.out.println("Second: anotherFun");
	}
}

class InnerInterfaceDemo
{
	public static void main(String args[])
	{
		//new First().myFun();
		//new Second().anotherFun();
		
		MyInterface mif = new First();
		MyInterface.MyAnotherInterface maf = new Second();
		
		mif.myFun();
		maf.anotherFun();
		
	}
}
