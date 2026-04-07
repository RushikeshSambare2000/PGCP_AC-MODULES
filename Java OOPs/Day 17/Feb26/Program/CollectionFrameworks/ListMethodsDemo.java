import java.util.*;

class ListMethodsDemo
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
		List<String> list1 = new ArrayList<>();
		
		//add method
		list1.add("Rohit");
		list1.add("Mohid");
		list1.add("Joseph");
		list1.add("Aakash");
		list1.add("Joseph");
		list1.add("Rajan");
		list1.add("Joseph");
		
		//Display list
		System.out.println("List1 elements:");
		display(list1);
		
		//get(index)
		String str = list1.get(3);
		System.out.println("list1.get(3): " + str);
		
		//add(index,element)
		
		list1.add(2,"Rita");
		System.out.println("List1 after list1.add(2,\"Rita\"):");
		display(list1);
		
		List<String> list2 = new LinkedList<>();
		list2.add("Geeta");
		list2.add("Mahesh");
		list2.add("Radha");
		
		//addAll(index,anotherlist)
		list1.addAll(3,list2);
		System.out.println("List1 after list1.addAll(3,list2):");
		display(list1);
		
		//indexOf(element)    
		//To search. Returns index of the first found element in the list and if not present
		//it returns -1
		
		int idx = list1.indexOf("Aakash");
		System.out.println("list1.indexOf(\"Aakash\"): " + idx);
		
		idx = list1.indexOf("Mohit");
		System.out.println("list1.indexOf(\"Mohit\"): " + idx);
	
		//lastIndexOf(element)
		//Returns index of the last found element in the list.
		
		idx = list1.lastIndexOf("Joseph");
		System.out.println("list1.lastIndexOf(\"Joseph\"): " + idx);
		
		int count = 0;
		idx = 0;
		for(String s: list1)
		{
			if(s.equals("Joseph"))
			{
				count++;
			}
			if(count == 2)
			{
				System.out.println("Second Joseph found at: " + idx);
				break;
			}
			idx++;
		}
		
		//remove(index)
		
		list1.remove(3);
		System.out.println("After list1.remove(3): ");
		display(list1);
		
		//set()
		list1.set(3,"Sandesh");
		System.out.println("After list1.set(3,\"Sandesh\"): ");
		display(list1);
		
		
		//subList()
		List<String> sublist1 = list1.subList(1,4);
		System.out.println("Sublist formed after list1.subList(1,4):");
		display(sublist1);
		
	}
}
