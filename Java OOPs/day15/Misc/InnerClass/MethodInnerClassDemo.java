class MethodInnerClassDemo
{
	public static void add(int a, int b)
	{
		class AddCalculator
		{
			int n1;
			int n2;
			
			AddCalculator(int n1, int n2)
			{
				this.n1 = n1;
				this.n2 = n2;
			}
			
			int getSum()
			{
				return n1+n2;
			}
		}
		
		AddCalculator ac = new AddCalculator(a,b);
		int res = ac.getSum();
		System.out.println("Sum = " + res);
	}
	
	
	
	public static void main(String args[])
	{
		add(10,15);
	}
}
