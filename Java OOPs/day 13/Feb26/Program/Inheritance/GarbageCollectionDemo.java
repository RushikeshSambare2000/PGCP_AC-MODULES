class Student
{
	int roll;
	
	Student(int roll)
	{
		System.out.println("Student object created");
		this.roll = roll;
	}
	
	protected void finalize()
	{
		//Pretask before destryoing the object
		System.out.println("finalize called for student with roll: " + this.roll);
	}
}


class GarbageCollectionDemo
{
	public static void myFun()
	{
		Student s = new Student(5);	//Local reference variable
	}
	
	
	public static void main(String args[])
	{
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		
		s1 = null;			//Nullifying the reference variable
		
		s2 = new Student(3);		//Reassigning the reference variable
		
		new Student(4);			//Anonymous object creation
		
		myFun();
			
		//System.gc();
		Runtime.getRuntime().gc();	//To explicitly call the garbage collector
	}
}
