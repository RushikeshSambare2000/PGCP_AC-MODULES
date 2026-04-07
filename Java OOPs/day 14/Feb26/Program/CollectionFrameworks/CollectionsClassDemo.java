import java.util.*;
class CollectionsClassDemo
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
		list1.add("Aakash");
		list1.add("Joseph");
		list1.add("Rajan");
		
		System.out.println("List1 elements:");
		display(list1);
		
		//shuffle() method
		Collections.shuffle(list1);
		System.out.println("List1 elements after Collections.shuffle(list1):");
		display(list1);
		
		//sort() method
		Collections.sort(list1);
		System.out.println("List1 elements after Collections.sort(list1):");
		display(list1);
		
		//sort() in reverseOrder or descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("List1 elements after Collections.sort(list1, Collections.reverseOrder()):");
		display(list1);
		
		//reverse()  to reverse the list
		Collections.reverse(list1);
		System.out.println("List1 elements after Collections.reverse(list1):");
		display(list1);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(15);
		set1.add(25);
		set1.add(10);
		set1.add(35);
		set1.add(30);
		
		//min() method
		int minVal = Collections.min(set1);		//can be used for List also
		System.out.println("Min value after Collections.min(set1): " +  minVal);
		
		//min() method
		int maxVal = Collections.max(set1);		//can be used for List also
		System.out.println("Max value after Collections.max(set1): " +  maxVal);
		
		
	}
}
