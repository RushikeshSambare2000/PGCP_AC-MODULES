import java.util.Scanner;

class ContactDetails
{
	String email;
	String mobileNo;
	
	ContactDetails()
	{
	}
	
	ContactDetails(String email, String mobileNo)
	{
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	void printContactDetails()
	{
		System.out.println(email + "," + mobileNo);
	}
}

class Student
{
	int roll;
	String name;
	double marks;
	
	ContactDetails contactDetails;
	
	Student()
	{
	
	}
	
	Student(int roll, String name, double marks, ContactDetails contactDetails)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.contactDetails = contactDetails;
	}
	
	void printDetails()
	{
		System.out.println(roll+","+name+","+marks+","+contactDetails.email+","+contactDetails.mobileNo);
		
	}
}


class CompositionDemo
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
			System.out.println("Enter record (roll, name, marks,email,mobile number):");
			int roll = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double marks = sc.nextDouble();
			//sc.nextLine();
			
			//Contact details
			String email = sc.next();
			String mobileNumber = sc.next();
			ContactDetails cd = new ContactDetails(email,mobileNumber);
	
			stud[i] = new Student(roll,name,marks, cd);
			
		}
		
		//Print the entered records
		System.out.println("Entered records are: ");
		for(int i = 0; i < noOfStudents; i++)
		{
			stud[i].printDetails();
		}
		
	}
}
