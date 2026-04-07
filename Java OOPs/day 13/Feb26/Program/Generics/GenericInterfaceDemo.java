interface MyGenInterface <T>
{
	T myFun();
	void myAnotherFun(T obj);
}


//Generic class implementing a generic interface
class One<T> implements MyGenInterface<T>
{
	T ob;
	
	One(T ob)
	{
		this.ob = ob;
	}
	
	public T myFun()
	{
		//return new T();		//Wrong; we can not use new with Type Parameter
		return this.ob;
	}
	
	public void myAnotherFun(T obj)
	{
		System.out.println(obj);
	}
	
	//other methods
	
}


//Non-generic class implementing a generic interface.
class Two implements MyGenInterface<String>
{
	String ob;
	
	Two(String ob)
	{
		this.ob = ob;
	}
	
	public String myFun()
	{
		//return new T();		//Wrong; we can not use new with Type Parameter
		return this.ob;
	}
	
	public void myAnotherFun(String obj)
	{
		System.out.println(obj);
	}
	
	//other methods
	
}

class GenericInterfaceDemo
{
	public static void main(String args[])
	{
		MyGenInterface<String> oneOb1 = new One<String>("Hi Friends");
		//One<String> oneOb1 = new One<String>("Hi Friends");
		System.out.println(oneOb1.myFun());
		oneOb1.myAnotherFun("How are you");
		
		Two twoOb1 = new Two("Welcome");
		System.out.println(twoOb1.myFun());
		twoOb1.myAnotherFun("Guys");
		
	}
}
