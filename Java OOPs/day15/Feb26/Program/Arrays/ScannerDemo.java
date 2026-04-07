import java.util.Scanner;

class ScannerDemo
{
	public static void main(String args[])
	{
		int age;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		age = sc.nextInt();
		System.out.println("Your age is " + age);
		
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Your salary is " + salary);
		
	}
}
