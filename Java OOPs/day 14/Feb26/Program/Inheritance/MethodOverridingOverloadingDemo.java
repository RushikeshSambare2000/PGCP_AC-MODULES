class First
{
	void myFun()
	{
		System.out.println("myFun of First");
	}
	
	void myFun(int a)	//Method Overloading
	{
		System.out.println("myFun(int) of First");
	}
	
	void anotherFun(int a)
	{
		System.out.println("anotherFun of First");
	}
	
}

class Second extends First
{
	void myFun(int a, int b)  //Method Overloading
	{
		System.out.println("myFun(int,int) of Second");
		super.anotherFun(25);	//Will call superclass anotherFun() method
		//anotherFun(25);		//Will call this class anotherFun() method
	}
	
	void anotherFun(int b)	//Method Overriding
	{
		System.out.println("anotherFun of Second");
	}
}

class MethodOverridingOverloadingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun();
		//s.myFun(10);
		s.myFun(10,15);
		s.anotherFun(20);
	}
}

