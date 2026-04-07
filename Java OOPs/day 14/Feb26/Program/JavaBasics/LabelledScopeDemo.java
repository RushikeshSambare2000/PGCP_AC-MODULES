class LabelledScopeDemo
{
	public static void main(String args[])
	{
		outer: {
			int a = 5;
			inner: {
				int b = 10;
				System.out.println(a);
				System.out.println(b);
				
				if(a < b) {
					break outer;
				}	
			}
			System.out.println("Out of inner scope");
			System.out.println(a);		
			//System.out.println(b);		//Compilation Error
		}
		System.out.println("Out of outer scope");
		//System.out.println(a);		//Compilation Error
		
		//System.out.println(5/0);		//Runtime Error
		System.out.println("Program terminated successfully");
	}
}
