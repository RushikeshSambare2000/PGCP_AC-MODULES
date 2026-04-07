import java.util.*;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 33, 2, 3, 52, 78, 4 };

        List<int[]> arrlist = Arrays.asList(arr);
        for (int[] i : arrlist) {
            for (int j : i) {
                System.out.print(j+" ");
            }    
        }
        System.out.println();
        
       //asList() method
		Integer arr5[] = {10,15,5,12,9};
		
		List<Integer> list1 = Arrays.asList(arr5);
		
		System.out.println("list1 after Arrays.asList(arr5):");
		for(Integer val : list1)
		{
			System.out.println(val);
		}
		
		//Array --> List (Backed)
		
		arr5[3] = 18;
		
		System.out.println("list1 after arr[3] = 18:");
		for(Integer val : list1)
		{
			System.out.println(val);
		}
        System.out.println();

        //sort
        Arrays.sort(arr);
        for(int  i : arr){
            System.out.print(i+" ");
        }
    }
}
