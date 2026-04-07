import java.util.*;
import java.util.stream.*;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double marks;
	
	Student()
	{
	}
	
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

class Demo
{
	static int compareStudMarks(Student s1, Student s2)
	{
		if(s1.marks > s2.marks) return 1;
		if(s1.marks < s2.marks) return -1;
		
		return 0;
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


class StreamDemo
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
		
		Student s1 = new Student(2,"Geeta",75.0);
		Student s2 = new Student(1,"Mohid",68.7);
		
		studList1.add(s1);
		studList1.add(s2);
		studList1.add(new Student(4,"Rohan",78.5));
		studList1.add(new Student(5,"Joseph",65.3));
		studList1.add(new Student(3,"Meeta",82.5));
		
		System.out.println("studList1 elements:");	
		display(studList1);
		
		//1. forEach() method - terminal
		
		System.out.println("Stream's forEach() to print studList1:");
		Stream<Student> studStream = studList1.stream();
		studStream.forEach(ob -> System.out.println(ob));
		//studList1.stream().forEach(ob -> System.out.println(ob));  //OK;
		//studStream.forEach(ob -> System.out.println(ob));  //ERROR; We can not reuse the stream
		
		//2. filter() method - intermediate
		
		System.out.println("List of students with marks >= 78.0 :");
		//studList1.stream().filter(s -> s.marks >= 78.0).forEach(e -> System.out.println(e));
		//studList1.stream().filter(s -> s.marks >= 78.0).forEach(System.out::println);
		List<Student> studList2 = 
			studList1.stream().filter(s -> s.marks >= 78.0).collect(Collectors.toList());
		//display(studList2);
		studList2.forEach(e -> System.out.println(e));
		//studList2.forEach(System.out::println);
		
		//3. concat() method - intermediate - static method
		
		List<Student> studList3 = new LinkedList<Student>();
		
		studList3.add(new Student(7,"Meena",89.0));
		studList3.add(new Student(6,"Chitra",83.0));
		
		List<Student> concatedStudList = 
		Stream.concat(studList1.stream(), studList3.stream()).collect(Collectors.toList());
		
		System.out.println("Concated Student List:");
		display(concatedStudList);
		
		//4. map() method - intermediate 
		
		//List<String> studNameList = 
			//studList1.stream().map(s -> s.name).collect(Collectors.toList());
		//Set<String> studNameList = 
		//	studList1.stream().map(s -> s.name).collect(Collectors.toSet());
		Set<String> studNameList = 
		studList1.stream().map(s -> s.name).collect(Collectors.toCollection(HashSet::new));
			
		System.out.println("Student's Name list:");
		display(studNameList);
		
		//5. sorted() method - intermediate
		System.out.println("studNameList in the Sorted Order:");
		studNameList.stream().sorted().forEach(System.out::println);
		
		System.out.println("studNameList in the Sorted Order (Roll-based sorting):");
		studList1.stream().sorted().forEach(System.out::println);
		
		System.out.println("studNameList in the Sorted Order (Marks-based sorting):");
		//studList1.stream().sorted(new StudMarksComparator()).forEach(System.out::println);
		studList1.stream().sorted(Demo::compareStudMarks).forEach(System.out::println);
		
		//6. peek() method - intermediate
		System.out.println("Incremented marks by 1 of studList1:");
		studList1.stream().peek(s -> s.marks = s.marks + 1).forEach(System.out::println);
		//studList1.stream().map(s -> s.marks = s.marks + 1).forEach(System.out::println);
		display(studList1);
		
		//7. max() method - terminal
		Optional<Student> optStud =  studList1.stream().max(new StudMarksComparator());
		if(optStud.isPresent())
		{
			Student maxMarksStud = optStud.get();
			System.out.println("Student with maximum marks using max():");
			System.out.println(maxMarksStud);
		}
		
		//8. reduce() method - terminal
		
		Student maxMarksStud =
		 studList1.stream().reduce(new Student(), (st1,st2) -> st1.marks > st2.marks ? st1 : st2);
		 
		System.out.println("Student with maximum marks using reduce():");
		System.out.println(maxMarksStud);
		
		//---------------------------------------------------------------
		
		//Using Stream with Array
		Integer arr[] = {2,5,3,8,7};
		
		//forEach() with array elements
		System.out.println("Array elements using stream forEach");
		Stream.of(arr).forEach(System.out::println);
		
		//max()
		//Optional<Integer> maxVal = Stream.of(arr).max(Integer::compareTo);
		Optional<Integer> maxVal = Stream.of(arr).max((a,b) -> a - b);
		if(maxVal.isPresent())
		{
			int val = maxVal.get();
			System.out.println("Max value in array is : " + val);
		}
		
		//min()
		//Optional<Integer> minVal = Stream.of(arr).min(Integer::compareTo);
		Optional<Integer> minVal = Stream.of(arr).min((a,b) -> a - b);
		if(minVal.isPresent())
		{
			int val = minVal.get();
			System.out.println("Min value in array is : " + val);
		}
		
		//reduce()
		int arrSum = Stream.of(arr).reduce(0,(a,b) -> a + b);
		System.out.println("Sum of array elements: " + arrSum);
		
	}
}
