//Parent class
class First
{
	int a;
	int b;
	
	First()
	{
	}
	
	First(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void print()
	{
		System.out.println(this.a);
		System.out.println(this.b);
	}
}

//Child class
class Second extends First
{
	
	int c;			//data : a,b,c
	
	Second()
	{
	}
	
	Second(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void display()
	{
		//System.out.println(a);
		//System.out.println(b);
		print();
		System.out.println(c);
	}	
}


class InheritanceDemo
{
	public static void main(String args[])
	{
		Second s = new Second(15,20,25);
		s.display();
	}
}






