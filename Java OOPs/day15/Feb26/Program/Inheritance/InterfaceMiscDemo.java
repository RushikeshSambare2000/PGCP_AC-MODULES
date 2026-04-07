interface A
{
	void fun1();
}

interface B
{
	void fun1();
	void fun2();
}

class First
{
}

class One extends First implements A,B
{
	//one implementation of fun1();
	//implementation of fun2();
	
	public void fun1()
	{
	}
	
	public void fun2()
	{
	}
}

interface C extends A,B
{
}


class InterfaceMiscDemo
{
	public static void main(String args[])
	{
		
	}
}
