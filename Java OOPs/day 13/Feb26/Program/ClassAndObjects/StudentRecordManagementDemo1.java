import java.util.Scanner;

class Student
{
	int roll;
	String name;
	double marks;
	
	Student()
	{
	
	}
	
	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	void printDetails()
	{
		System.out.println(roll+","+name+","+marks);
	}
}


class StudentRecordManagementDemo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int noOfStudents;
		Student stud[];
	
		System.out.println("Enter total no. of students:");
		noOfStudents = sc.nextInt();
		
		stud = new Student[noOfStudents];	//Array of references for Student objects
		
		//Take input and populate the student array.
		
		for(int i = 0; i < noOfStudents; i++)
		{
			System.out.println("Enter record (roll, name, marks):");
			int roll = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();
			stud[i] = new Student(roll,name,marks);
			
		}
		
		//Print the entered records
		System.out.println("Entered records are: ");
		for(int i = 0; i < noOfStudents; i++)
		{
			stud[i].printDetails();
		}
		
	}
}
