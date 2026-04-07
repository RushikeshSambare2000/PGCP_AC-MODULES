import java.io.*;

class Student implements Serializable
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

class DeserializationDemo
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("studobj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stud = (Student)ois.readObject();
		
		fis.close();
		ois.close();
		
		System.out.println("Object deserialized successfully!!");
		System.out.println("Deserialized object: ");
		System.out.println(stud);
	}
}
