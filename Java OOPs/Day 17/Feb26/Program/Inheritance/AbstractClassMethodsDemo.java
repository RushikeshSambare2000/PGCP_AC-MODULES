abstract class First
{
	private int a;
	
	First()
	{
		this.a = 0;
	}
	
	First(int a)
	{
		this.a = a;
	}
	
	void myFun()				//concrete method
	{
		System.out.println("myFun of First");
	}
	
	abstract void anotherFun();		//abstract method
}

class Second extends First
{
	void anotherFun()
	{
		System.out.println("anotherFun of Second");
	}
}

class AbstractClassMethodsDemo
{
	public static void main(String args[])
	{
		//new First();		//error: First is abstract; cannot be instantiated
		/*Second s = new Second();
		s.anotherFun();
		s.myFun();*/
		
		First s = new Second();		//OK; parent ref = child object
		s.anotherFun();
		s.myFun();
	}
}
