package mypack.subpack2;
import mypack.subpack1.First;

public class Third
{
	public void funOfThird()
	{
		First f = new First();
		System.out.println(f.a);	//OK
		//System.out.println(f.b);	//ERROR; b is private inside First
		//f.printB();
		//f.b = -100;
		//f.setB(-100);
		//System.out.println(f.getB());
		//System.out.println(f.c);	//ERROR; default can be accessed within the same package
		//System.out.println(f.d);	//ERROR; can be accessed in same package or within child
	}
}




