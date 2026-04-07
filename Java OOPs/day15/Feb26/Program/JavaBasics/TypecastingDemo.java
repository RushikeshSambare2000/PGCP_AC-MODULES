class TypecastingDemo
{
	public static void main(String args[])
	{
		int ival = 10;
		double dval = 23.5;
		char ch = 'A';
		
		ival = ch;		//int = char
		System.out.println("ival = " + ival);
		
		ch = (char)ival;  	//Need typecasting here to fix 
					//error: incompatible types: possible lossy conversion 
					
		System.out.println("ch = " + ch);
		
		dval = ival;
		System.out.println("dval = " + dval);
		
		ival = (int)dval;		//Need typecasting here to fix 
					//error: incompatible types: possible lossy conversion
		System.out.println("ival = " + ival);
		
		dval = 98.75;
		ch = (char) dval;
		System.out.println("ch = " + ch);
	}
}
