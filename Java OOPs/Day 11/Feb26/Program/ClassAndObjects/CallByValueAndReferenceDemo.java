class First
{
	int a;
	
	First(int a)
	{
		this.a = a;
	}
	
	void print()
	{
		System.out.println(a);
	}
	
	void oneFun(int x)
	{
		x = 10;
		System.out.println("call by value where x = " + x);
	}
	
}

class CallByValueAndReferenceDemo
{
	static void anotherFun(First fst)
	{
		fst.a = 15;
	}
	
	public static void main(String args[])
	{
		First f = new First(10);
		
		int p = 5;
		f.oneFun(p);		//call by value
		System.out.println(p);
		
		
		f.print();
		anotherFun(f);	//Call by reference: No new object is created here. Only reference of the 
				//Same object is passed. So if any change is made in the
				//object inside called method that will reflect here also
		f.print();
	}
}
