package mypack.subpack2;
import mypack.subpack1.First;

public class Fourth extends First
{
	public void funOfFourth()
	{
		System.out.println(a);	//OK
		//System.out.println(this.b);	//ERROR
		System.out.println(getB());
		//System.out.println(this.c);	//ERROR
		System.out.println(d);	//OK
	}
}

