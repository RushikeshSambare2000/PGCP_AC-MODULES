import java.util.*;
import java.util.regex.*;

class RegularExpressionDemo
{
	public static void main(String args[])
	{
		
	
		//String regex = "(\\+91|0)[0-9]{10}";
		//String regex = "[^D][a-zA-Z0-9]+@(gmail.com|cdac.in)";
		//String regex = "[a-zA-Z][a-zA-Z0-9]*@(gmail.com|yahoo.com|cdac.in)";
		//String regex = "[a-zA-Z]\\w*@(gmail.com|yahoo.com|cdac.in)";
		//String regex = "\\D\\w*@(gmail.com|yahoo.com|cdac.in)";
		//String regex = "(0|\\+91)[1-9][0-9]{9}";	//mobile no. validation	
		String regex = "(0|\\+91)[1-9]\\d{9}";	//mobile no. validation		
		
		
		String inptStr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to match with regex : "+regex);
		inptStr = sc.nextLine();
		
		boolean matched = inptStr.matches(regex);

		if(matched)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}
}
