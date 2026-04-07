class A				//Enclosing outer class
{
	int val;
	
	A(int val)
	{
		this.val = val;
	}
	
	void myFun()
	{
		System.out.println("A:myFun");
		//getSquare();	//ERROR
		B bobj = new B();
		int res = bobj.getSquare();
		System.out.println("square of " + val + " = " + res);
	}
	
	class B			//Inner class
	{
		int p = 5;
				
		int getSquare()
		{
			System.out.println("B:getSquare");
			return val * val;
			//return val*val + p;		//OK
		}
	}
	
	static class C				//static inner class
	{
		void oneFun()
		{
			System.out.println("C:oneFun");
		}
	}
}



class InnerClassDemo
{
	public static void main(String args[])
	{
		A aobj1 = new A(5);
		aobj1.myFun();
		
		//A.B bobj1 = new A.B(); 	//ERROR
		//A.B bobj1 = aobj1.new B();	//OK;
		A.B bobj1 = new A(10).new B();	//OK;
		int res = bobj1.getSquare();
		System.out.println("square = " + res);
		
		//static inner class object
		A.C cobj1 = new A.C();		//OK; static inner class object
		cobj1.oneFun();
		
		
	}
}
