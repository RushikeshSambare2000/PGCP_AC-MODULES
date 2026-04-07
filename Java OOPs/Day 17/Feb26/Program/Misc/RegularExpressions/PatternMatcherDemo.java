import java.util.regex.*;
import java.util.*;

class PatternMatcherDemo
{
	public static void main(String args[])
	{
		//String regex = "\\bjava\\b";
		String regex = "(0|\\+91)[1-9]\\d{9}";	//mobile no.
		String inputStr;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string to match " + regex);
		inputStr = sc.nextLine();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputStr);

		while(matcher.find())
		{
			System.out.println("found " + matcher.group()+" at  index : " + matcher.start() + " to " + matcher.end());
		}

	}
}
