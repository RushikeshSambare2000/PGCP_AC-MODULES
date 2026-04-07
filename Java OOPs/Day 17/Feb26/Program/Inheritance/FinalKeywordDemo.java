class First
{
	final int a;
	
	First()
	{
		a = 0;
	}
	
	First(int a)
	{
		this.a = a;
		//this.a = 5;		//ERROR
		//a = 10;		//Compilation ERROR
	}
	
	void myFun()
	{
		final int val;
		val = 5;		//OK; First time initialized
		//val = 10;		//ERROR; already initialized
	}
	
	final void anotherFun()			//Can not be overridden
	{
		System.out.println("anotherFun of First");
	}
}

final class Second extends First
{
	/*void anotherFun()			//ERROR; as anotherFun() in parent is final
	{
		System.out.println("anotherFun of Second");
	}*/
}


class Third extends Second		//ERROR; class Second is final so it can not be inherited
{
}


class FinalKeywordDemo
{
	public static void main(String args[])
	{
		//First f = new First(15);
		Second s = new Second();
		s.anotherFun();
	}
}
