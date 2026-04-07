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

class MyGen <T>
{
	T ob;
	int count;		//We can keep primitive instance variable inside the generic class.

	MyGen(T ob)
	{
		this.ob = ob;
	}
	
	T getOb()
	{
		return ob;
	}
}

class GenDemo
{
	public static void main(String args[])
	{
		//MyGen<int> mg1 = new MyGen<int>(15);	//ERROR; Generics works with Class type only
		MyGen<Integer> mg1 = new MyGen<Integer>(15);			//Integer ob = 15
		Integer iob = mg1.getOb();
		System.out.println(iob);
		
		MyGen<String> mg2 = new MyGen<String>("Welcome");
		String strOb = mg2.getOb();
		System.out.println(strOb);
		
		Student s = new Student(1,"Raj");
		MyGen<Student> mg3 = new MyGen<Student>(s);
		Student studOb = mg3.getOb();
		System.out.println(studOb);		//System.out.println(sutdOb.toString());	
	}
}
