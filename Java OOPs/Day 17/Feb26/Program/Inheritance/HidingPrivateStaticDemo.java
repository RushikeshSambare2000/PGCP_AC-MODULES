class First
{
	static void myFun()
	{
		System.out.println("myFun of First");
	}
	
	private void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
	
	void oneFun()
	{
		System.out.println("oneFun of First");
		anotherFun();		//Static Binding; will bind on compile time.
		myFun();		//Static Binding; will bind with local myFun of First.
	}
	
}

class Second extends First
{
	static void myFun()		//Method Hiding
	{
		System.out.println("myFun of Second");	
	}
	
	void anotherFun()		//Method Hiding
	{
		System.out.println("anotherFun of Second");
	}
	
	void secondFun()
	{
		System.out.println("secondFun of Second");
		anotherFun();		//Static Binding
		myFun();		//Static Binding; will bind with local myFun of Second.
	}	
}

class HidingPrivateStaticDemo
{
	public static void main(String args[])
	{
		First f = new Second();	
		f.oneFun();			//static binding
		
		Second s = new Second();
		s.oneFun();			//static binding
		//s.myFun();
	}
} 
