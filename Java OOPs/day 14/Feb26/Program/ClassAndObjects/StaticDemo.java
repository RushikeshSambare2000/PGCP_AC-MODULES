class Student
{
	int roll;
	double marks;
	
	
	static int objCount;
	static String noticeBoard = "Welcome Students";
	
	
	Student()
	{
		objCount++;
	}
	
	static void displayNoticeBoard()
	{
		System.out.println(noticeBoard);
		//System.out.println(roll);  	//Error; can't access non-static
		//System.out.println(marks);	//Error; can't access non-static
	}
	
	static void printTotalObjectCount()
	{
		System.out.println("Total object created till now: " + objCount);
	}
}

class StaticDemo
{
	static void myFun()		//non-static
	{
		System.out.println("myFun of StaticDemo");
	}
	
	public static void main(String args[])
	{
		Student.printTotalObjectCount();
		System.out.println(Student.noticeBoard);
		Student.noticeBoard = "Today is holiday";
		//System.out.println(Student.noticeBoard);
		Student.displayNoticeBoard();
		
		Student s1 = new Student();	
		s1.noticeBoard = "Hey, I passed the GATE exam -- Asif"; //object.staticData
		
		Student s2 = new Student();
		s2.displayNoticeBoard();		//object.staticMethod();
		
		myFun();				//StaticDemo.myFun();
		
		Student.printTotalObjectCount();
	}
}
