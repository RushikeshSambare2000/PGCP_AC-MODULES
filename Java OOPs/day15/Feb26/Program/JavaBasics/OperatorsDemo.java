class OperatorsDemo
{
	public static void main(String args[])
	{
		//increment, decrement operator
		
		int a = 5;
		int b;
		b = a++ + ++a;
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		b = 10;
		int res = a & b;
		System.out.println("res of a & b = " + res);
		
		res = ~a;
		System.out.println("res of ~a = " + res);
		
		boolean b1 = true;
		boolean b2 = false;
		boolean r = b1 | b2;
		System.out.println("b1 | b2 = " + r);
		
		int age = 23;
		
		//if(age >= 20 && age <= 30)
		if(age >= 20 & age <= 30)
		{
			System.out.println("Eligible to participate");
		}
		
		
		a = 5;
		b = 10;
		res = a > b ? a++ : b++;
		
		System.out.println(res + ", " + b );
		
		
	}
}


