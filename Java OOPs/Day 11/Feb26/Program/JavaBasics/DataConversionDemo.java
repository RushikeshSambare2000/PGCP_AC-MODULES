class DataConversionDemo
{
	public static void main(String args[])
	{
		//long lv = 3333333;	//long = int
		//long lv = 3333333333;	//long = int; Compilation Error: integer number too large
		long lv = 3333333333L;	//long = long; OK
		System.out.println(lv);
		
		//float fl = 35.6;		//float = double; CE possible lossy conversion 
		//float fl = 35.6f;		//OK
		//float fl = 35.6F;		//OK
		//float fl = (float) 35.6;	//OK
		double fl = 35.6;
		System.out.println(fl);
		
		//char ch = 'a';
		//char ch = 97;	     	//decimal assignment
		//char ch = '\141'; 	//Octal assignment
		//char ch = '\u0061'; 	//Hexa assignment
		//char ch = 0141;	//char ch = 97
		char ch = 0X61;
		
		System.out.println(ch);
		
		int a = 5;
		double d = 25.3;

		//int res = a * d;			//CE: possible lossy conversion
		//double res = a * d;
		//int res = (int)a * d;			//CE: possible lossy conversion
		int res = (int)(a * d);	
		
		System.out.println(res);
		
		res = a * ch;
		System.out.println(res);
	}
}
