import java.lang.*;
class wrapperclass
{
	public static void main(String args[])
	{
		// int a = 132;
		
		// Integer iobj = new Integer(a);   //wrapping int to Integer object
		// System.out.println(iobj);
		
		// System.out.println(iobj.intValue());
		// System.out.println(iobj.doubleValue());
		
		// char ch = 'A';
		// Character chObj = new Character(ch);
		
		// System.out.println(Character.isUpperCase(ch));
		
		// char ch1 = Character.toLowerCase(ch);
		// System.out.println(ch1);
		
		// System.out.println("Binary of " + a +" : "+Integer.toBinaryString(a));
		// System.out.println("Hexadecimal of " + a +" : "+Integer.toHexString(a));
		// System.out.println("Octal of " + a +" : "+Integer.toOctalString(a));

		int a =10;
		float b=10.5f;
		byte c = 2;
		short d = 3;
		long  e = 123;
		double f= 12321;
        char g='A';
		boolean h=true;

		Integer aa=new Integer(a);   //boxing
		System.out.println(aa);
		System.out.println(aa.getClass().getName());
		int aaa=aa;                 //unboxing

		Boolean hh= new Boolean(h);   //boxing
		System.out.println(h);
		System.out.println(hh.getClass().getName());
		boolean hhh=hh;    //unboxing

		Double ff = new Double(f);
		System.out.println(ff);
		System.out.println(ff.getClass().getName());

		Character gg = g;  //autoboxing
		System.out.println(gg);
		System.out.println(gg.getClass().getName());
		char ggg=gg;  //auto unboxing
		


	}
}