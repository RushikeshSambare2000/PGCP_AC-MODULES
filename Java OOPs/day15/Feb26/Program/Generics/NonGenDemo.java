class Student
{
	int roll;
	String name;
	
	Student(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
	public String toString()
	{
		return "[" + this.roll + "," + this.name + "]";		// [1,Raj]
	}
}

class MyGen
{
	Object ob;

	MyGen(Object ob)
	{
		this.ob = ob;
	}
	
	Object getOb()
	{
		return ob;
	}
}

class NonGenDemo
{
	public static void main(String args[])
	{
		MyGen mg1 = new MyGen(15);			
		Integer iob = (Integer)mg1.getOb();
		System.out.println(iob);
		
		MyGen mg2 = new MyGen("Welcome");
		String strOb = (String)mg2.getOb();
		System.out.println(strOb);
		
		Student s = new Student(1,"Raj");
		MyGen mg3 = new MyGen(s);
		Student studOb = (Student)mg3.getOb();
		System.out.println(studOb);	
		
		mg1 = mg2;		//Will work; No type safety
		
		if(mg1 == mg3)		//Comparing different types
		{
			System.out.println("mg1 == mg3");	
		}
		else
		{
			System.out.println("mg1 != mg3");
		}
		
		if(mg1.equals(mg3))
		{
			System.out.println("mg1.equals(mg3) : true");	
		}
		else
		{
			System.out.println("mg1.equals(mg3) : false");
		}		
	}
}
