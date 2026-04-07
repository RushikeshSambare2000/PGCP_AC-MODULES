import java.io.Serializable;

class EmployeeBean implements Serializable
{
	private int empId;
	private String name;
	
	public EmployeeBean()
	{
	}
	
	public int getEmpId()
	{
		return this.empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}


class BeanDemo
{
	public static void main(String args[])
	{
		EmployeeBean emp1 = new EmployeeBean();
		EmployeeBean emp2 = new EmployeeBean();
		
		//emp1.empId = 1; //Error
		
		emp1.setEmpId(1);
		emp1.setName("Aakash");
		
		emp2.setEmpId(2);
		emp2.setName("Prakash");
		
		System.out.println(emp1.getEmpId() + "," + emp1.getName());
		System.out.println(emp2.getEmpId() + "," + emp2.getName());
	
	}
}
