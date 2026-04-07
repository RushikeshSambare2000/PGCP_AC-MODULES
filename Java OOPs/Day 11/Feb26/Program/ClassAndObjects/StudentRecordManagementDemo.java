import java.util.Scanner;

class Student
{
	int roll;
	String name;
	double marks;
}


class StudentRecordManagementDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int noOfStudents;
		Student stud[];
	
		System.out.println("Enter total no. of students:");
		noOfStudents = sc.nextInt();
		
		stud = new Student[noOfStudents];
		
		//Take input and populate the student array.
		
		for(int i = 0; i < noOfStudents; i++)
		{
			stud[i] = new Student();
			System.out.println("Enter record (roll, name, marks):");
			stud[i].roll = sc.nextInt();
			sc.nextLine();
			stud[i].name = sc.nextLine();
			stud[i].marks = sc.nextDouble();
		}
		
		//Print the entered records
		System.out.println("Entered records are: ");
		for(int i = 0; i < noOfStudents; i++)
		{
			System.out.println(stud[i].roll+","+stud[i].name+","+stud[i].marks);
		}
		
	}
}
