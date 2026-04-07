package mypack.subpack1;

public class Second
{
	public void funOfSecond()
	{
		First f = new First();
		System.out.println(f.a);	//OK
		//System.out.println(f.b);	//ERROR; b is private inside First
		//f.printB();
		//f.b = -100;
		//f.setB(-100);
		System.out.println(f.getB());
		System.out.println(f.c);	//OK; default can be accessed within the same package
		System.out.println(f.d);	//OK; can be accessed in same package or within child
	}
}
