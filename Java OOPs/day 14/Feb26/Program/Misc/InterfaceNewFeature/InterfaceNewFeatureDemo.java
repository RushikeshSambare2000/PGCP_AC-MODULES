interface MyInterface
{
	void myFun1();
	
	//implemented i.e. non-abstract methods
	static void myFun2()
	{
		System.out.println("static myFun2 of MyInterface");
	}
	
	default void myFun3()	 //To provide the default implementation	
	{
		System.out.println("non-static default myFun3 of MyInterface");
	}
}


class MyClass implements MyInterface
{
	public void myFun1()
	{
		System.out.println("myFun1 of MyClass");
	}
	
	/*public void myFun3()	 //To provide the default implementation	
	{
		System.out.println("non-static myFun3 of MyClass");
	}*/
}


class InterfaceNewFeatureDemo
{
	public static void main(String args[])
	{
		MyClass mcls1 = new MyClass();
		mcls1.myFun1();
		mcls1.myFun3();
		
		MyInterface.myFun2();
	}
}
