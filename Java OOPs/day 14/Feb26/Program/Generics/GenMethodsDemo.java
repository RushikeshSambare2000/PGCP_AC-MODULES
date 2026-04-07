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
			
	MyGen(T ob)
	{
		this.ob = ob;
	}
	
	T getOb()
	{
		return ob;
	}
	
	<T1> void myFun(T1 obj)
	{
		System.out.println(obj);
	}
	
	static <T2> void anotherFun(T2 obj)
	{
		System.out.println(obj);
	}
}

class GenMethodsDemo
{
	public static void main(String args[])
	{
		MyGen<String> mg1 = new MyGen<String>("Welcome");	//OK;
		
		mg1.myFun(new Student(1,"Raj"));
		MyGen.anotherFun(new Student(2,"Geeta"));					
	}
}
