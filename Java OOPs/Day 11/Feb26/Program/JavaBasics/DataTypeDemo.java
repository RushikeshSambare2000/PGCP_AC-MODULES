class DataTypeDemo
{
	public static void main(String args[])
	{
		int val = 260;
		System.out.println("Value = " + val);
		
		byte bt;
		bt = (byte)260;			//byte = int
		System.out.println("val of bt = " + bt); //Output: 4
		
		bt = (byte)130;			//byte = int
		System.out.println("val of bt = " + bt); //Output: -126
		
	}
}

//output
//Value = 260
