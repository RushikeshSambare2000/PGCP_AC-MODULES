class Calculator
{
	void add(int num1, int num2)
	{
		int res = num1 + num2;
		System.out.println(res);
	}
	
	void add(double num1, double num2)
	{
		double res = num1 + num2;
		System.out.println(res);
	}
	
}

class MethodOverloadingDemo
{
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		cal.add(5,3);
		cal.add(15.3,12.5);
		//cal.add('a','b');
	}
}
