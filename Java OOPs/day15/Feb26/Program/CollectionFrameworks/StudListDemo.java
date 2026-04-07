import java.util.*;

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
		return this.roll + "," + this.name ;		// [1,Raj]
	}
}

class StudListDemo
{
	public static void main(String args[])
	{
		//ArrayList<Student> studList = new ArrayList<Student>();
		//LinkedList<Student> studList = new LinkedList<Student>();
		List<Student> studList = new LinkedList<Student>();
		//Set<Student> studList = new HashSet<Student>();
		
		Student s1 = new Student(1,"Geeta");
		Student s2 = new Student(2,"Mohid");
		
		studList.add(s1);
		studList.add(s2);
		studList.add(new Student(3,"Rohan"));
		studList.add(new Student(4,"Joseph"));
		studList.add(new Student(5,"Meeta"));
		
		//Itertate using for each
		System.out.println("Iterate using for-each");
		for(Student s : studList)
		{
			System.out.println(s);
		}
		
		//Itertate using Iterator
		System.out.println("Iterate using Iterator");
		Iterator<Student> it = studList.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}
}
