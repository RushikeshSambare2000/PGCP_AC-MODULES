import java.util.*;

class CollectionMethodsDemo
{
	public static void display(Collection<?> c)
	{
		for(Object ob: c)
		{
			System.out.println(ob);
		}
	}
	 
	public static void main(String args[])
	{
		//List<String> list1 = new ArrayList<>();
		Set<String> list1 = new HashSet<>();
		
		//add method
		list1.add("Rohit");
		list1.add("Mohid");
		list1.add("Aakash");
		list1.add("Joseph");
		list1.add("Rajan");
		
		//Display list
		System.out.println("List1 elements:");
		display(list1);
		
		
		List<String> list2 = new LinkedList<>();
		list2.add("Geeta");
		list2.add("Mahesh");
		list2.add("Radha");
		
		System.out.println("List2 elements:");
		display(list2);
		
		//addAll() method
		
		list1.addAll(list2);
		
		System.out.println("List1 after list1.addAll(list2): ");
		display(list1);
		
		//isEmpty()
		
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		//contains
		
		boolean bl = list1.contains("Raj");		//false
		System.out.println("list1.contains(\"Raj\"): "+bl);
		
		bl = list1.contains("Geeta");		//false
		System.out.println("list1.contains(\"Geeta\"): "+bl);
		
		//containsAll()
		
		List<String> list3 = new ArrayList<>();
		list3.add("Rahman");
		list3.add("Rohit");
		list3.add("Joseph");
		
		bl = list1.containsAll(list2);		//true
		System.out.println("list1.containsAll(list2): "+bl);
		
		bl = list1.containsAll(list3);		//false; as Rahman is not there in the list1
		System.out.println("list1.containsAll(list3): "+bl);
		
		//remove()
		//list1.remove("aakash");
		System.out.println("list1 after list1.remove(\"aakash\"): ");
		display(list1); 
		
		//removeAll()
		//list1.removeAll(list2);		//removes all the elments from the list1 which is found
						//in the list2
		System.out.println("list1 after list1.removeAll(list2): ");
		display(list1);				
		
		//list1.removeAll(list3);		//removes all the elments from the list1 which is found
						//in the list3
		System.out.println("list1 after list1.removeAll(list3): ");
		display(list1);	
		
		//retainAll()
		//list1.retainAll(list3);	//List1 will retain only the elements which are common in 
						//list1 and list3
		System.out.println("list1 after list1.retainAll(list3): ");
		display(list1);	
		
		//size() method
		System.out.println("list1.size() : " + list1.size());
		
		//toArray() method
		System.out.println("Array after list1.toArray():");
		Object []arr = list1.toArray();
		for(Object ob: arr)
		{
			String s = (String) ob;
			System.out.println(ob);
		}
		
		System.out.println(arr[3]);
		
		//clear()
		list1.clear();			//Will remove all elements from the list1.
		System.out.println("List1 after list1.clear(): ");
		display(list1);
	}
}
