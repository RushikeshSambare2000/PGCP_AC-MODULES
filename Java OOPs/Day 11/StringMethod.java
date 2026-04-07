class StringMethod
{
	public static void main(String args[])
	{
		String str1 = "Welcome";
		String str2 = "Welgone";
		String str3 = " ";
		
		//charAt(index)
		System.out.println(str1.charAt(3));
		
		// getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		char dst[] = new char[5];
		str1.getChars(3,6,dst,1);
		System.out.println(dst);
		
		//toCharArray()
		char chArr[] = str1.toCharArray();
		
		for(int i = 0; i < chArr.length; i++)
		{
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		
		//compareTo()
		System.out.println("str1.compareTo(str2) : "+str1.compareTo(str2));
		
		//indexOf(char)
		System.out.println("str1.indexOf('e') : "+str1.indexOf('e',3));
		
		//indexOf(string)
		System.out.println("str1.indexOf(\"com\") : "+str1.indexOf("com"));
		
		//contains(string)
		System.out.println("str1.contains(\"com\") : "+str1.contains("com"));
		
		//isEmpty()
		System.out.println("str3.isEmpty() : "+str3.isEmpty());
		
		//join()
		String joinedStr = String.join("-",str1,str2);
		System.out.println(joinedStr);
		
		String day = "1";
		String month = "4";
		String year = "2026";
		joinedStr = String.join("/",day,month,year)	;	// 1/4/20226
		System.out.println(joinedStr);
		
		//split()
		String str4 = "30/5/2025";		//hello#$friends#$how
		
		String strArr[] = str4.split("/");
		
		System.out.println("After str4.split(\"/\")");
		for(String s: strArr)
		{
			System.out.println(s);
		}
		
		
		//StringBuffer strBfr = "Welcome";		//ERROR
		StringBuffer strBfr = new StringBuffer("Welcome");
		strBfr.append(" Friends");
		System.out.println("strBfr : " + strBfr);
		
	}
}

