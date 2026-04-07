import java.util.*;
import java.util.stream.*;

class ValueBasedSortedMapDemo
{
	public static void main(String args[])
	{
		Map<Integer,Double> map1 = new HashMap<>();
		map1.put(1,72.5);
		map1.put(2,65.2);
		map1.put(3,82.5);
		map1.put(4,76.3);
		map1.put(5,62.5);
		
		//Value based sorted map
		
		Map<Integer,Double> sortedMap = 	
		map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
					Map.Entry::getKey,
					Map.Entry::getValue,
					(e1,e2) -> e1,
					LinkedHashMap::new
					));
		System.out.println("Sorted map based on value: ");			
		for(Map.Entry<Integer,Double> entry: sortedMap.entrySet())
		{
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		
		String words[] = {"hello","friends", "how", "are", "you"};
		
		//Map <String,Integer> wordMap = 
		//	Stream.of(words).collect(Collectors.toMap(s -> s, s -> s.length()));
			
		Map <String,Integer> wordMap = 
			Stream.of(words).collect(Collectors.toMap(
			s -> s, 
			s -> s.length(),
			(s1,s2) -> s2,
			LinkedHashMap::new
			));
			
		System.out.println("Words with their lengths map : ");
		for(Map.Entry<String, Integer> entry : wordMap.entrySet())
		{
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
					
		
	}
}
