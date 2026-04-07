enum Role
{
	ADMIN(1),FACULTY(2),STUDENT(3);
	
	int roleId;
	
	Role()
	{
		System.out.println("Zero-arg constructor");
	}
	
	Role(int roleId)
	{
		this.roleId = roleId;
		System.out.println("One-arg constructor");
	}
	
}

class User
{
	int userId;
	Role role;
	
	User(int userId, Role role)
	{
		this.userId = userId;
		this.role = role;
	}
	
	void setRole(Role role)
	{
		this.role = role;
	}
		
}

class EnumDemo
{
	public static void main(String args[])
	{
		User user1 = new User(1, Role.ADMIN);
		System.out.println(user1.role + "," + user1.role.roleId);
		
		//user1.setRole(Role.FACULTY);
		
		User user2 = new User(1, Role.ADMIN);
		
		//compareTo()
		if(user1.role.compareTo(user2.role) == 0)
			System.out.println("user1 and user2 both have same role");
		else
		 	System.out.println("user1 and user2 both have different role");
		
		//Use in switch case
		switch(user1.role)
		{
			case ADMIN:
				System.out.println("Role is " + Role.ADMIN);
				break;
			case FACULTY:
				System.out.println("Role is " + Role.FACULTY);
				break;
			case STUDENT:
				System.out.println("Role is " + Role.STUDENT);
				break;
			default:
				System.out.println("No role specified");
		}
		
		//ordinal()
		System.out.println("Ordinal value of Role.FACULTY: " + Role.FACULTY.ordinal());
	}
} 
