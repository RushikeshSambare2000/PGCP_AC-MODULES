class MyGen<T1,T2>
{
	T1 ob1;
	T2 ob2;
	
	MyGen()
	{
	}
	
	void setOb1(T1 ob1)
	{
		this.ob1 = ob1;
	}
	
	void setOb2(T2 ob2)
	{
		this.ob2 = ob2;
	}
	
	void print()
	{
		System.out.println(this.ob1);
		System.out.println(this.ob2);
	}
}

class GenDemo1
{
	public static void main(String args[])
	{
		MyGen<Integer,String> mg1 = new MyGen<Integer,String>();
		mg1.setOb1(100);
		mg1.setOb2("Hello");
		mg1.print();
		
		MyGen<String,Double> mg2 = new MyGen<String,Double>();
		mg2.setOb1("Welcome");
		mg2.setOb2(10.0);
		mg2.print();
	}
}
