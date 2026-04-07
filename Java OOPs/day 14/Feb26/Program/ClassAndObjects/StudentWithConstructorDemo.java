class Student
{
	// Data/property/state
	
	int roll;
	private String name;
	double marks;
	
	
	//Methods
	
	Student()		//Zero-argument constructor
	{
		System.out.println("Zero-arg constructor of Student");
	}
	
	Student(int roll)
	{
		System.out.println("One-arg constructor of Student");
		this.roll = roll;
	}
	
	Student(int roll, String name, double marks)	//Three-argument constructor
	{
		this();		//will call zero-arg constructor.
		System.out.println("3-arg first constrctor called");
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	Student(String n, int r, double m)	//Three-argument constructor
	{
		//this(r);
		this(r,n,m);
		System.out.println("3-arg second constrctor called");
		//roll = r;
		//name = n;
		//marks = m;
	}
	
	void setData(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		//this.updateName(name);	//updateName(name)
		this.marks = marks;
	}
	
	void updateName(String n)
	{
		name = n;
	}
	
	void printDetails()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
	}
	
}

class StudentWithConstructorDemo
{
	public static void main(String args[])
	{
		Student s1 = null; //It does not creates object. It is creating a reference variable.
		s1 = new Student();		//will call zero-arg construtor
		s1.setData(1,"Mohit",72.5);
		
		Student s2 = new Student();	//will call zero-arg constructor
		s2.setData(2,"Geeta",76.8);
		
		s1.printDetails();
		s2.printDetails();
		
		Student s3 = new Student(3,"Aakash",78.9);	//will call three-arg first constructor
		s3.updateName("Anand");
		//s3.name = "Anand";
		s3.printDetails();
		
		Student s4 = new Student("Mohid",4,80.5);	//will call three-arg second constructor
		//Student s4 = new Student(4,"Mohid",80.5);	//will call three-arg first constructor
		s4.printDetails();
		
		Student s5 = new Student(5);			//will call one-arg constructor 
		s5.printDetails();

	}		
}
