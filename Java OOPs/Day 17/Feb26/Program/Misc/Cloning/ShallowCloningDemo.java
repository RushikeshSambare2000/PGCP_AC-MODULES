class Demo
{
	int a;
	Demo()
	{
	}
	
	Demo(int a)
	{
		this.a = a;
	}
	
	public String toString()
	{
		return "Demo[" + a + "]"; 
	}
}


class First implements Cloneable
{
	int b;
	Demo d;
	
	First()
	{
	}
	
	First(int b, Demo d)
	{
		this.b = b;
		this.d = d;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		First f = (First)super.clone();	//creating and returning reference of cloned object here
		return f;
	}
	
	public String toString()
	{
		return "First[" + d + "," + b + "]";
	}
}

class ShallowCloningDemo
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Demo d1 = new Demo(10);
		First f1 = new First(15,d1);
		System.out.println("f1: "+f1);
		
		First f2 = (First)f1.clone();
		System.out.println("f2: "+ f2);
		
		f2.b = 20;
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
		
		f1.d.a = 25;
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
	}
}
