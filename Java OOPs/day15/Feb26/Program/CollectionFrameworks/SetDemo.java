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
	
	public int hashCode()
	{
		return Objects.hash(roll,name);
	}
	
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		
		Student s = (Student) ob;
		
		if(this.roll == s.roll && this.name.equals(s.name))
		{
			return true;
		}
		
		return false;
	}
}


class SetDemo
{
	public static void display(Collection<?> c)
	{
		for(Object ob: c)
		{
			System.out.println(ob);
		}
	}
	 
	public static void main(String args[])
	{
		//Set<String> set1 = new HashSet<>();
		//Set<String> set1 = new LinkedHashSet<>(); //Will maintain insertion order
		Set<String> set1 = new TreeSet<>(); 	//Will sort the elements
		
		//add method
		set1.add("Rohit");
		set1.add("Mohid");
		set1.add("Joseph");
		set1.add("Aakash");
		set1.add("Joseph");
		set1.add("Rajan");
		set1.add("Joseph");
		//set1.add(null);
		
		
		//Display list
		System.out.println("Set1 elements:");
		display(set1);
		
		//Set<Student> studSet1 = new HashSet<>();
		Set<Student> studSet1 = new TreeSet<>();
		
		Student s1 = new Student(1,"Raj");
		Student s2 = new Student(2,"Geeta");
		
		studSet1.add(s1);
		studSet1.add(s2);
		studSet1.add(new Student(3,"Mohit"));
		studSet1.add(new Student(4,"Joseph"));
		studSet1.add(new Student(5,"Radhika"));
		
		System.out.println("StudSet1 elements:");
		display(studSet1);
		
		
		//Comment out the equals() and hashCode() and then observe the output.
		studSet1.add(new Student(4,"Joseph"));
		System.out.println("StudSet1 elements after studSet1.add(new Student(4,\"Joseph\")):");
		display(studSet1);
		
		Student s3 = new Student(2,"Geeta");
		boolean bl = studSet1.contains(s3);
		System.out.println("studSet1.contains(s3): " + bl);
		
	}
	
}
	
