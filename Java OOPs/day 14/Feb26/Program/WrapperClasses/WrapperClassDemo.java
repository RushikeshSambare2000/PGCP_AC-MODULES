class WrapperClassDemo
{
	public static void main(String args[])
	{
		int a = 132;
		
		Integer iobj = new Integer(a);   //wrapping int to Integer object
		System.out.println(iobj);
		
		System.out.println(iobj.intValue());
		System.out.println(iobj.doubleValue());
		
		char ch = 'A';
		Character chObj = new Character(ch);
		
		System.out.println(Character.isUpperCase(ch));
		
		char ch1 = Character.toLowerCase(ch);
		System.out.println(ch1);
		
		System.out.println("Binary of " + a +" : "+Integer.toBinaryString(a));
		System.out.println("Hexadecimal of " + a +" : "+Integer.toHexString(a));
		System.out.println("Octal of " + a +" : "+Integer.toOctalString(a));
		
		Integer iobj1 = 123;
		Integer iobj2 = 123;
		Integer iobj3 = new Integer(123);
		Integer iobj4 = new Integer(123);
		
		System.out.println("iobj1 == iobj2 : " + (iobj1 == iobj2));
		System.out.println("iobj1 == iobj3 : " + (iobj1 == iobj3));
		System.out.println("iobj3 == iobj4 : " + (iobj3 == iobj4));
		System.out.println("iobj1.equals(iobj3) : " + (iobj1.equals(iobj3)));
		
	}
}
