import java.util.*;

public class NotBackedSetDemo {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<String> ();
        listNames.add("Ram");
        listNames.add("Geeta");
        listNames.add("Mohan");

        Object[] names = new Object[listNames.size()];
	
	//List to array
        names = listNames.toArray();
        
        //change in list
        listNames.set(0, "Ramesh");
        
        //change will not reflect in corresponding array.
        System.out.println("List contents:" + listNames.toString());
        System.out.println("Array contents: " + Arrays.toString(names));
    }
}


