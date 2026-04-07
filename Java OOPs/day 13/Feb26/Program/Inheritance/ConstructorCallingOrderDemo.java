class First
{
	private int b;
	First()
	{
		b = 5;
		System.out.println("First constructor called");
	}
	
	void setB(int b)
	{
		this.b = b;
	}
		
}

class Second extends First
{
	Second()
	{
		//b = 10;			//ERROR
		setB(10);			//OK
		System.out.println("Second constructor called");
	}
}

class Third extends Second
{
	Third()
	{
		System.out.println("Third constructor called");
	}
	
	Third(int b)
	{
		System.out.println("Third constructor - one arg called");
		setB(b);
	}
}


public class ConstructorCallingOrderDemo
{
	public static void main(String args[])
	{
		//new Third();		//It will call First ---> Second ---> Third constructor
		
		System.out.println("Calling one-arg constructor");
		new Third(10);	//It will call 
				//First zero-arg ---> Second zero-arg ---> Third one-arg constructor
	}
}


