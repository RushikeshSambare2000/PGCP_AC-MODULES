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

class SerializationDemo
{
	public static void main(String args[]) throws Exception
	{
		Student studObj = new Student(1,"Rohit",98.0);
		
		FileOutputStream fos = new FileOutputStream("studobj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(studObj);
		
		fos.close();
		oos.close();
		
		System.out.println("Object serialized and saved successfully!!");
	}
}
