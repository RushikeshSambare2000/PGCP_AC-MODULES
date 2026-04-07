class Student
{
	//Data
	
	int roll;
	double marks;
	String name;
	
	//Methods
	
}


class StudentDemo
{
	public static void main(String args[])
	{
		//Creating object
		
		Student s1 = null; //It does not creates object. It is creating a reference variable.
		s1 = new Student();
		
		s1.roll = 1;
		s1.name = "Mohit";
		s1.marks = 72.5;
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		
		Student s2;
		s2 = new Student();
		s2.roll = 2;
		s2.name = "Sita";
		s2.marks = 65.5new Student();
		
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		
		Student s3;
		s3 = s2;
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		System.out.println(s3.marks);
		
		s3.name = "Geeta";
		System.out.println(s2.name);

	}		
}


