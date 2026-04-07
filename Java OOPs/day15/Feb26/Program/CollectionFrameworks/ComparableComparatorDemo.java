import java.util.*;

class Student implements Comparable<Student>
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
	
	public int hashCode()
	{
		return Objects.hash(roll,name,marks);
	}
	
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		
		Student s = (Student) ob;
		
		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks)
		{
			return true;
		}
		
		return false;
	}
	
	public int compareTo(Student s)
	{
		//first object ==> this; second object ==> ob
		// equal = return 0; first > second then return +ve; first < second then return -ve
		
		//Comparison based on roll.
		return this.roll - s.roll;
		
		//Comparison based on name.
		//return this.name.compareTo(s.name);		//Using here String's compareTo();
	}
	
	public String toString()
	{
		return this.roll + "," + this.name + "," + this.marks;		// [1,Raj]
	}
}

//Comparator class to compare two students based on their name.
class StudNameComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

//Comparator class to compare two students based on their marks.
class StudMarksComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.marks > s2.marks) return 1;
		if(s1.marks < s2.marks) return -1;
		
		return 0;
	}
}


class ComparableComparatorDemo
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
		//Set<Student> studSet1 = new HashSet<>();
		Set<Student> studSet1 = new TreeSet<>();	//It will use compareTo() of Student
		//Set<Student> studSet1 = new TreeSet<>(new StudNameComparator()); //It will use compare 
						//of StudNameComparator for comparing student objects
						
		//Set<Student> studSet1 = new TreeSet<>(new StudMarksComparator()); //It will use compare 
						//of StudNameComparator for comparing student objects 
		
		
		Student s1 = new Student(1,"Raj",75.3);
		Student s2 = new Student(2,"Geeta",65.0);
		
		studSet1.add(s1);
		studSet1.add(s2);
		studSet1.add(new Student(3,"Mohit",75.1));
		studSet1.add(new Student(4,"Joseph",92.0));
		studSet1.add(new Student(5,"Radhika",72.0));
		
		System.out.println("StudSet1 elements:");
		display(studSet1);
		
		
		//Comment out the equals() and hashCode() and then observe the output.
		studSet1.add(new Student(4,"Joseph",92.0));
		System.out.println("StudSet1 elements after studSet1.add(new Student(4,\"Joseph\")):");
		display(studSet1);
		
		Student s3 = new Student(2,"Geeta",65.0);
		boolean bl = studSet1.contains(s3);
		System.out.println("studSet1.contains(s3): " + bl);
		
	}
	
}


	
