import java.security.Key;
import java.util.*;

class mapdemo {
	static <T1, T2> void displayMap(Map<T1, T2> map) {
		for (Map.Entry<T1, T2> e : map.entrySet()) {
			T1 key = e.getKey();
			T2 value = e.getValue();
			System.out.println(key + " , " + value);
		}
	}

	public static void main(String[] args) {
		// hashmap, treemap
		// roll - key
		// name - value
		Map<Integer, String> map1 = new HashMap<>();

		// put(key value)
		map1.put(1, "Raj");
		map1.put(2, "geeta");
		map1.put(3, "joseph");
		map1.put(4, "Ram");
		map1.put(1, "Radhika");

		// get(key) return value associated with key
		String name = map1.get(4);
		System.out.println(name);

		map1.put(2, "meeta"); // update value of key 2
		String name1 = map1.get(2);
		System.out.println(name1);

		// iterate the map1
		Set<Map.Entry<Integer, String>> set1 = map1.entrySet();
		for (Map.Entry<Integer, String> e : set1) {
			Integer key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " , " + value);
		}

		Map<String, Integer> map2 = new TreeMap<>();
		map2.put( "Raj",1);
		map2.put( "geeta",2);
		map2.put( "joseph",3);
		map2.put( "Ram",4);
		map2.put( "Radhika",5);

		System.out.println("map2 elements :");
		displayMap(map2);


		// method of map
		// keyset()
		System.out.println("Key Using Keyset : ");
		Set<Integer> kset=map1.keySet();
		for(Integer k : kset){
			System.out.println(k);
		}

		//values()
		System.out.println("values using values() : ");
		Collection<String> valset= map1.values();
		for(String val : valset){
			System.out.println(val);
		}

	}
}