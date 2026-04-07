interface MyInterface
{
	void myFun();
	void anotherFun();
}

/*class MyClass implements MyInterface
{
	public void myFun()
	{
		System.out.println("myFun called");
	}
	
	public void anotherFun()
	{
		System.out.println("anotherFun called");
	}
}*/

class AnonymousInnerClassDemo
{
	public static void main(String args[])
	{
		
		//MyInterface mif1 = new MyInterface(){}; 	//Syntax of anonymous inner class.
								//Implementation + object creation
		
		MyInterface mif1 = new MyInterface(){
			public void myFun()
			{
				System.out.println("anonymous inner myFun called");
			}
			
			public void anotherFun()
			{
				System.out.println("anonymous inner anotherFun called");
			}	
		};
		
		mif1.myFun();
		mif1.anotherFun();

	}
}
