class First
{
	int a = 1;
	static int b;
	
	{
		//non-static block
		a = 2;			//OK
		System.out.println("Non-static block-1");
	}
	
	static
	{
		//static block
		//a = 3;			//ERROR; Can't access non-static member
		b = 1;				//OK; Can access only static member
		System.out.println("Static block-1");
	}
	
	{
		//non-static block
		a = 3;			//OK
		System.out.println("Non-static block-2");
	}
	
	static
	{
		System.out.println("Static block-2");
	}
	
	First(int a)
	{
		this.a = a;
	}
	
	void display()
	{
		System.out.println(this.a);
	}
	
	static void print()
	{
		System.out.println(b);
	}	
}

class StaticNonStaticBlockDemo
{
	public static void main(String args[])
	{
		First f = new First(5);			//One-arg constructor
		f.display();
		First.print();
		f = new First(10);			//One-arg constructor
		f.display();
		First.print();
	}
}
