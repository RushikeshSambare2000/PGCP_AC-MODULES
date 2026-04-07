import java.util.*;

class ListDemo
{
	public static void main(String args[])
	{
		//ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list1 = new LinkedList<>();
		
		//add() method
		list1.add("Geeta");		
		list1.add("Rohan");
		list1.add("Joseph");
		list1.add("Mohit");
		list1.add("Kiyara");
		
		//Iterate and display list elements
		//Using for-each
		System.out.println("Iterating list using for-each:");
		for(String s : list1)
		{
			System.out.println(s);
		}
		
		//Using Iterator
		System.out.println("Iterating list using Iterator:");	
		
		Iterator<String> it = list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Using ListIterator
		System.out.println("Iterating list using ListIterator:");	
		
		ListIterator<String> lit = list1.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("Iterating list in reverse direction using ListIterator:");	
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		//Using Enumeration
		System.out.println("Iterating list using Enumeration:");	
		
		Enumeration<String> em = Collections.enumeration(list1);
		
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
			
	}
}
