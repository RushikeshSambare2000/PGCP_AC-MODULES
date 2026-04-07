class Demo
{
	int a = 5;
	
}


class ObjectClassMethodsDemo
{
	public static void main(String args[])
	{
		//hashCode() method
		Demo d1 = new Demo();
		int hc1 = d1.hashCode();
		System.out.println("Hashcode of d1 : " + hc1);
		
		Demo d2 = new Demo();
		int hc2 = d2.hashCode();
		System.out.println("Hashcode of d2 : " + hc2);
		
		//toString() method
		String s1 = d1.toString();
		String s2 = d2.toString();
		
		System.out.println("d1.toString() : " + s1);
		System.out.println("d2.toString() : " + s2);
		
		//equals() method
		Demo d3 = d1;
		boolean b1 = d1.equals(d2);	//will return false
		boolean b2 = d1.equals(d3);	//will return true
		System.out.println("d1.equals(d2): " + b1);
		System.out.println("d1.equals(d3): " + b2);
		System.out.println("d1 == d2: " + (d1 == d2));
		System.out.println("d1 == d3: " + (d1 == d3));
		System.out.println("Hashcode of d3 : " + d3.hashCode());
		
		
		
	}
}
