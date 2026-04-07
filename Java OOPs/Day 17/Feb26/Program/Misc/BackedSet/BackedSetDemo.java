import java.util.*;

public class BackedSetDemo {

    public static void main(String[] args) {
        String[] names = { "Ram", "Geeta", "Mohan" };  
        
       	//Array to list
       	List<String> listNames = Arrays.asList(names);
       	
       	//change in list element
	listNames.set(0, "Ramesh");

	//change will reflect in respective array also.
        System.out.println("List contents:" + listNames.toString());
        System.out.println("Array contents: " + Arrays.toString(names));
    }
}

