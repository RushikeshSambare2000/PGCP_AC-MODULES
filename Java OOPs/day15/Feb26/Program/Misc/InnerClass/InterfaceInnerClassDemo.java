interface MyInterface
{
	class One
	{
		void myFun()
		{
			System.out.println("myFun of MyInterface.One");
		}
	}
}

class InterfaceInnerClassDemo
{
	public static void main(String args[])
	{
		MyInterface.One oneObj = new MyInterface.One();
		oneObj.myFun();
	}
}
