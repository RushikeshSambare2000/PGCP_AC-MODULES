import java.util.Objects;

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
		//String s = "Student[roll = " + this.roll + ", name = " + this.name + "]";
		//return s;		
		return "Student[roll = " + this.roll + ", name = " + this.name + "]";
	}
	
	public int hashCode()
	{
		//return this.roll * 2;
		return Objects.hash(roll,name);
	}
	
	public boolean equals(Object ob)
	{
		if(ob == null)
			return false;
		
		Student s = (Student)ob;			//Downcasting
		
		if(this.roll == s.roll && this.name == s.name)
		{
			return true;
		}
	
		return false;
	}
}

class OverridingObjectClassMethods
{
	public static void main(String args[])
	{
		Student s1 = new Student(1,"Sachin");
		Student s2 = new Student(2,"Geeta");
		Student s3 = new Student(1,"Sachin");
		
		System.out.println(s1);	//converted to System.out.println(s1.toString());
		
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equal");
		}
		else
		{
			System.out.println("s1 and s2 are not equal");
		}
		
		if(s1.equals(s3))			//Object ob = s3;
		{
			System.out.println("s1 and s3 are equal");
			System.out.println("Hashcodes of s1 & s3: " + s1.hashCode() + "," + s3.hashCode());
		}
		else
		{
			System.out.println("s1 and s3 are not equal");
		}
	}
}
