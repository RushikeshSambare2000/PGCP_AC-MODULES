import java.util.*;

public class setdemo {
    // only for list/arraylist/linkedlist
    // public static <T> void display(List<T> list) {
    // for (T s : list) {
    // System.out.println(s);
    // }
    // }

    // using wild card use for set and list
    // public static void display(List<?> list){
    // for(Object s : list){
    // System.out.println(s);
    // }
    // }

    // use for set and list both collection is parent for both
    public static void display(Collection<?> c) {
        for (Object ob : c) {
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        // add elements
        list1.add("Rushi");
        list1.add("Rahul");
        list1.add("anuja");
        list1.add("Rohit");

        // display list
        System.out.println("List 1 :");
        System.out.println(list1);

        // iterate list using display method
        display(list1);

        System.out.println("List 2 :");
        List<String> list2 = new LinkedList<>();
        list2.add("amol");
        list2.add("amul");
        list2.add("aaksh");
        list2.add("ankur");
        list2.add("karn");
        list2.add("kiran");
        list2.add("ketan");

        display(list2);

        // add list2 all element in list1
        System.out.println("Add all list 1 in list 2 method :");
        list1.addAll(list2);
        display(list1);

        // isEmpty
        System.out.println("List 1 Isempty : " + list1.isEmpty());
        // list1.clear();
        // System.out.println("List 1 Isempty : "+list1.isEmpty());

        // contains : return true if found
        System.out.println("List 1 contains : " + list1.contains("Rushi"));

        //containall
        System.out.println("List 1 contanall list 2 : "+list1.containsAll(list2));

        List<String> list3 = new ArrayList<>();
        list3.add("mukesh");
        list3.add("mihit");
        list3.add("manaohar");
        list3.add("aaksh");
        list3.add("ankur");

        System.out.println("List 2 contanall list 3 : "+list1.containsAll(list3));

        // remove using index
        System.out.println("Remove element 0 index in list 1 : ");
        list1.remove(0);
        display(list1);

        //remove using element name
        list2.remove("amol");
        System.out.println("Remove amol from list 2 : ");
        display(list2);


        //
        // removeall
        System.out.println("Remove list 2 from list 1 :");
        list1.removeAll(list2);
        display(list1);

        System.out.println("After return : ");
        //retailall return common from both
        list1.retainAll(list3);
        display(list1);

        //size of list 
        System.out.print("size of list 3 : ");
        System.out.println(list3.size());
        
        //clear list
        System.out.println("clear list 3 : ");
        list3.clear();
        display(list3);

        // return array that contain all the elements stored in the invoking object
        System.out.println("Convert list to Array : ");
        Object [] arr = list2.toArray();
        for(Object ob:arr){
            System.out.print(ob+" ");
        }
        // display(list2);

    }
}
