import java.util.*;

class Student
{
	int roll;
	String name;
	double marks;
	
	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "["+this.roll + "," + this.name + "," + this.marks+"]";		
	}
}



class StudentMapDemo
{
	static <T1,T2> void displayMap(Map<T1,T2> map)
	{
		for(Map.Entry<T1,T2> e: map.entrySet())
		{
			T1 key = e.getKey();
			T2 value = e.getValue();
			
			System.out.println(key +"," + value);
			
		}
	}
	
	public static void main(String args[])
	{
		//Map<Integer,Student> studMap1 = new HashMap<>();
		Map<Integer,Student> studMap1 = new TreeMap<>();
		
		//Scanner object sc
		//int size = sc.nextInt();
		//loop to take input for each student for(int i = 0; i < size; i++)
		//inside loop read data for each field  rollNo = sc.nextInt(); same for name and marks
		//inside loop put that student object into the map
		//Student s1 = new Student(roll,name,marks)
		//studMap.put(s1.rollNo,s1);
		
		Student s1 = new Student(1,"Raj",72.5);
		Student s2 = new Student(2,"Geeta",73.6);
		
		studMap1.put(1, s1);
		studMap1.put(2, s2);
		studMap1.put(3, new Student(3,"Mohid",78.9));
		studMap1.put(4, new Student(4,"Radha",65.9));
		studMap1.put(5, new Student(5,"Navin",85.9));
		
		
		System.out.println("Iterating studMap1 using for-each:");
		//displayMap(studMap1);
		
		for(Map.Entry<Integer,Student> e : studMap1.entrySet())
		{
			Integer key = e.getKey();
			Student stud = e.getValue();
			
			System.out.println(key + "," + stud);
		}
		
	}
}










