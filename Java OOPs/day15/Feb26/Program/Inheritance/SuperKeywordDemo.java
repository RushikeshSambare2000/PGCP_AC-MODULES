
class One
{
	One()
	{
		System.out.println("Zero-arg constructor of One called");
	}
}

class First extends One
{
	private int a;
	
	First()
	{
		System.out.println("Zero-arg constructor of First called");
		a = 5;
	}
	
	First(int a)
	{
		System.out.println("One-arg constructor of First called");
		this.a = a;
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	
	void print()
	{
		System.out.println(a);
	}
	
}

class Second extends First
{
	Second()
	{
		//super(15);   		//OK
		System.out.println("Zero-arg constructor of Second called");
	}
	
	Second(int a)
	{
		super(a);	//It will call one-arg constructor of First and will pass a to that
		//super();	//It will First class' zero-arg constructor
		//this.a = a;	//ERROR; a is private in parent
		//setA(a);
		System.out.println("One-arg constructor of Second called");
	}
	
	void display()
	{
		super.print();		//print() method of parent class;
		//super.a;		//syntax wise OK but as a is private it will give error 
	}
}

class SuperKeywordDemo
{
	public static void main(String args[])
	{
		Second s = new Second(10);
		s.display();
		
	}
}


