class MyGen <T extends Number> 	//T can be either Number or Child of Number
{
	T ob;
	int count;		//We can keep primitive instance variable inside the generic class.

	MyGen(T ob)
	{
		this.ob = ob;
	}
	
	T getOb()
	{
		return ob;
	}
}

class GenWithExtendsDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);	//OK;
		MyGen<Double> mg2 = new MyGen<Double>(23.5);	//OK;
		//MyGen<String> mg3 = new MyGen<String>("Hello");	//ERROR; as String is not the 
									//child of Number
		
		System.out.println(mg1.getOb());
		System.out.println(mg2.getOb());
							
	}
}
