import java.util.*;

class MapDemo
{
	static <T1,T2> void displayMap(Map<T1,T2> map)
	{
		for(Map.Entry<T1,T2> e: map.entrySet())
		{
			T1 key = e.getKey();
			T2 value = e.getValue();
			
			System.out.println(key +"," + value);
			
		}
	}
	
	public static void main(String args[])
	{
		//HashMap, TreeMap
		//Roll as a key, name as a value
		
		//Map<Integer,String> map1 = new HashMap<Integer,String>();	//OK
		//Map<Integer,String> map1 = new HashMap<>();			//OK
		//Map<Integer,String> map1 = new TreeMap<>();			//OK; Key based sorting
		Map<Integer,String> map1 = new LinkedHashMap<>();		//OK; Maintains 
										//Insertion order
		
		//put(key,value) method
		map1.put(2,"Raj");
		map1.put(1,"Geeta");
		map1.put(5,"Joseph");
		map1.put(4,"Imran");
		map1.put(3,"Radhika");
		
		
		System.out.println("Map1 entries:");
		displayMap(map1);
		
		//get(key) : It returns the object associated with the key
		String name = map1.get(4);
		System.out.println("map1.get(4): "+name);
		
		map1.put(2,"Meeta");	//Now it will update/replace the object against the key 2
		
		name = map1.get(2);
		System.out.println("map1.get(2): "+name);
		
		//Iterate the map
		System.out.println("Iterating map using for-each:");
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
		
		System.out.println("Iterating map using using Iterator:");
		Set<Map.Entry<Integer,String>> set1 = map1.entrySet();
		Iterator<Map.Entry<Integer,String>> it = set1.iterator();
		
		while(it.hasNext())
		{
		 	Map.Entry<Integer,String> e = it.next();
			Integer key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key +"," + value);
			
		}
		
		Map<String,Integer> map2 = new TreeMap<>();			//OK; Key based sorting
		
		//put(key,value) method
		map2.put("Raj",1);
		map2.put("Geeta",2);
		map2.put("Joseph",3);
		map2.put("Imran",4);
		map2.put("Radhika",5);
		
		System.out.println("map2 elements:");
		displayMap(map2);
		
		//keySet()
		System.out.println("Map1 keys are:");
		Set<Integer> kSet = map1.keySet();
		for(Integer key : kSet)
		{
			System.out.println(key);
		}
		
		//values()
		System.out.println("Map1 values are:");
		Collection<String> values = map1.values();
		for(String val : values)
		{
			System.out.println(val);
		}
		
		
		//iterating map2 using Iterator
		System.out.println("Iterating map2 using Iterator: ");
		Set<Map.Entry<String,Integer>> entrySet1 = map2.entrySet();
		Iterator<Map.Entry<String,Integer>> it1 = entrySet1.iterator();
		while(it1.hasNext())
		{
			Map.Entry<String,Integer> e = it1.next();
			String key = e.getKey();
			Integer val = e.getValue();
			
			System.out.println(key + "," + val);
		}
		
		//containsKey()
		boolean bl = map1.containsKey(5);
		System.out.println("map1.containsKey(5) : " + bl);
		
		bl = map1.containsKey(6);
		System.out.println("map1.containsKey(6) : " + bl);
		
		//size()
		System.out.println("map1.size(): " + map1.size());
		
		//isEmpty()
		System.out.println("map1.isEmpty(): " + map1.isEmpty());
		
		//remove()
		map1.remove(4);		//Removing the element from the map with key 4
		System.out.println("map1 after map1.remove(4):");
		displayMap(map1); 
	
	}
}
