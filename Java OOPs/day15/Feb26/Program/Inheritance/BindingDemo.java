class First
{
	void myFun()
	{
		System.out.println("myFun of First");
	}
	
	void myAnotherFun()
	{
		System.out.println("myFun(int) of First");
	}
	
	void myAnotherFun(int a)
	{
		System.out.println("myAnotherFun(int) of First");
	}
}

class Second extends First
{
	void myFun()
	{
		System.out.println("myFun of Second");
	}
}


class BindingDemo
{
	public static void main(String args[])
	{
		First f1 = new First();
		f1.myFun();		//It is bound with myFun() of First. Dynamic Binding
		f1.myAnotherFun();	//Static binding
		
		First f2 = new Second();
		f2.myFun();		//It is also bound with myFun() of Second. Dynamic Binding
		
		
	}
}
