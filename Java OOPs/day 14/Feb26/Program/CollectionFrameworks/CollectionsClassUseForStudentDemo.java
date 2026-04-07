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
	
	public int compareTo(Student s)
	{
		return this.roll - s.roll;
	}
	
	public String toString()
	{
		return "["+this.roll + "," + this.name + "," + this.marks+"]";		
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

class CollectionsClassUseForStudentDemo
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
		List<Student> studList1 = new LinkedList<Student>();
		
		Student s1 = new Student(1,"Geeta",75.0);
		Student s2 = new Student(2,"Mohid",68.7);
		
		studList1.add(s1);
		studList1.add(s2);
		studList1.add(new Student(3,"Rohan",78.5));
		studList1.add(new Student(4,"Joseph",65.3));
		studList1.add(new Student(5,"Meeta",82.5));
		
		//display studList1
		System.out.println("studList1 elements:");
		display(studList1);
		
		//shuffle()
		Collections.shuffle(studList1);
		System.out.println("studList1 after Collections.shuffle(studList1):");
		display(studList1);
		
		//sort()
		//Collections.sort(studList1);		//will use Comparable compareTo() of Student
		//Collections.sort(studList1, new StudMarksComparator()); //Marks based sort
		Collections.sort(studList1, new StudNameComparator()); //Name based sort
		
		System.out.println("studList1 after Collections.sort(studList1):");
		display(studList1);
		
		
		//sort() in reverseOrder
		//Collections.sort(studList1,Collections.reverseOrder());		//will use Comparable compareTo() of Student
		//Collections.sort(studList1, Collections.reverseOrder(new StudMarksComparator())); //Marks based sort
		Collections.sort(studList1, Collections.reverseOrder(new StudNameComparator())); //Name based sort
		
		System.out.println("studList1 after Collections.sort(studList1):");
		display(studList1);
	}
}
