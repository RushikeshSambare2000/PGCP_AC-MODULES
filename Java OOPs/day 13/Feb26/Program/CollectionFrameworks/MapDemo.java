import java.util.*;

class MapDemo
{
	public static void main(String args[])
	{
		//HashMap, TreeMap
		//Roll as a key, name as a value
		
		//Map<Integer,String> map1 = new HashMap<Integer,String>();	//OK
		Map<Integer,String> map1 = new HashMap<>();			//OK
		
		//put(key,value) method
		map1.put(1,"Raj");
		map1.put(2,"Geeta");
		map1.put(3,"Joseph");
		map1.put(4,"Imran");
		map1.put(5,"Radhika");
		
		//get(key) : It returns the object associated with the key
		String name = map1.get(4);
		System.out.println("map1.get(4): "+name);
		
		map1.put(2,"Meeta");	//Now it will update/replace the object against the key 2
		
		name = map1.get(2);
		System.out.println("map1.get(2): "+name);
		
		//Iterate the map
		System.out.println("Iterating map using entryset:");
		/*Set<Map.Entry<Integer,String>> set1 = map1.entrySet();
		for(Map.Entry<Integer,String> e: set1)
		{
			Integer key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key +"," + value);
			
		}*/
		
		for(Map.Entry<Integer,String> e: map1.entrySet())
		{
			Integer key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key +"," + value);
			
		}
	
	}
}
