class JaggedArrayDemo
{
	public static void main(String args[])
	{
		int arr[][] =   {
					{5,10},
					{15,20,25,30},
					{35,40,45} 
				};
				
		System.out.println("Elements of Jagged Array:");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//System.out.println(arr[0][2]);		//ArrayIndexOutOfBound Runtime Error
		
		
	}
}
