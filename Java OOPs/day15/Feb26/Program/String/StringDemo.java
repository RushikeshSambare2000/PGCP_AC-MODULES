class StringDemo
{
	public static void main(String args[])
	{
		String str1 = "Hello";		//OK; stored in String Constant Pool
		String str2 = new String("Welcome"); //OK; stored in Heap Area
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		String str3 = "Hello";  //First it will search in constant pool
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str1 == str3)		//TRUE
		{
			System.out.println("str1 == str3 : true"); 
		}
		
		if(str1 == str4)		//FALSE
		{
			System.out.println("str1 == str4 : true"); 
		}
		
		if(str4 == str5)		//FALSE
		{
			System.out.println("str4 == str5 : true"); 
		}
		
		if(str1.equals(str4))		//TRUE
		{
			System.out.println("str1.equals(str4) : true"); 
		}
		
	}
}
