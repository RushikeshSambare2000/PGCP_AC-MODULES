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
	
	void myFirstFun(T obj)
	{
		System.out.println(obj);
	}
	
	void mySecondFun(MyGen<T> obj)
	{
		System.out.println(obj);
	}
	
	void myThirdFun(MyGen<?> obj)
	{
		System.out.println(obj);
	}
	
	void myFourthFun(MyGen<? extends Number> obj)
	{
		System.out.println(obj);
	}
	
	public String toString()
	{
		return ob.toString();
	}
}

class UsingWildCardInMethodDemo
{
	public static void main(String args[])
	{
		MyGen<String> mg1 = new MyGen<String>("Welcome");	//OK;
		
		Student s = new Student(1,"Raj");
		mg1.myFun(s);
		
		//mg1.myFirstFun(s);		//ERROR;
		mg1.myFirstFun("Hello");
		
		MyGen<Student> mg2 = new MyGen<Student>(new Student(2,"Geeta"));
		MyGen<String> mg3 = new MyGen<String>("Friends");	//OK;
		MyGen<Double> mg4 = new MyGen<Double>(23.5);	//OK;
		
		//mg1.mySecondFun(mg2);				//ERROR
		mg1.mySecondFun(mg3);				//OK
		
		mg1.myThirdFun(mg2);				//OK
		
		//mg1.myFourthFun(mg2);				//ERROR;
		
		mg1.myFourthFun(mg4);				//OK				
	}
}
