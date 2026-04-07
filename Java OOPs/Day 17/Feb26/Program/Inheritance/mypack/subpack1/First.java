package mypack.subpack1;

public class First
{
	public int a = 5;
	private int b = 10;
	int c = 15;
	protected int d = 20;
	
	void printB()
	{
		System.out.println(b);
	}
	
	public int getB()
	{
		return b;
	}
	
	void setB(int b)
	{
		if(b >= 0)
			this.b = b;
		else
			System.out.println("b can not be negative");
	}
}
