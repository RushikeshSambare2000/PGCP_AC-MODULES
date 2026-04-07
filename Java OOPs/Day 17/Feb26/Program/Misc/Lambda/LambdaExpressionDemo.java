interface MyInterface
{
	void myFun();
}

interface AddCalculator
{
	int add(int a, int b);
}

class LambdaExpressionDemo
{
	public static void main(String args[])
	{
		//Anonymous inner class for MyInterface.
		MyInterface mif1 = new MyInterface(){
			public void myFun()
			{
				//System.out.println("myFun called");
				System.out.println("Bye...");
			}
		};
		
		mif1.myFun();
		
		//Lambda expression for MyInterface
		//MyInterface mif2 = () -> { System.out.println("myFun called"); };
		MyInterface mif2 = () -> System.out.println("myFun called");	
		mif2.myFun();
		
		
		//Anonymous inner class implementation
		AddCalculator ac1 = new AddCalculator(){
			public int add(int a, int b)
			{
				return a+b;
			}
		};
		
		int res = ac1.add(10,15);
		System.out.println("Sum = " + res);
		
		
		//Lambda expression for AddCalculator
		
		//AddCalculator ac2 = (int a, int b) -> { return a+b; } ;
		//AddCalculator ac2 = (a, b) -> { return a+b; } ;
		AddCalculator ac2 = (a, b) -> a+b;
		
		res = ac2.add(15,30);
		System.out.println("Sum using lambda = " + res);
		

	}
}
