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
	}
}
