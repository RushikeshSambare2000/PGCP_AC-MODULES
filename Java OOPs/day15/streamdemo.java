import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamdemo{
    public static void main(String args[]){

        //filter
        List<String> list= Arrays.asList("Akshit","Ram", "Shaym", "Ghanshyam");
        Stream<String> filterstream=list.stream().filter(x->x.startsWith("A"));
        long res = filterstream.count();
        System.out.println(res); //1
        List<String> result = list.stream().filter(x -> x.startsWith("A")).toList();   // Java 16+
        System.out.println(result);  //[Akshit]
       
        //map
        Stream<String> stringstream = list.stream().map(String::toUpperCase);
        System.out.println(stringstream.toList());
        
        //sorted
        Stream<String> listsort = list.stream().sorted();
        System.out.println(listsort.toList());
        //sort on length using comparator
        Stream<String> listsort2 = list.stream().sorted((a,b)->a.length()-b.length());
        System.out.println(listsort2.toList());

        //distinct
        System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());  //1

        //limit
        System.out.println(Stream.iterate(1, x->x+1).limit(100).count());       //100
        Stream.iterate(1, x -> x + 1).limit(100).forEach(System.out::println); //1-100

        //skip
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).forEach(System.out::println);   //11-110



        //*****************termination operation**********************************
        List<Integer> list2=Arrays.asList(1,2,3,4,5);

        //collect()
        list2.stream().skip(1).collect(Collectors.toList());
        list2.stream().skip(1).toList();
        System.out.println(list2);

        //forEach
        list2.stream().forEach(x->System.out.println(x));

        //reduce  : combine result and produce single result
        Optional<Integer> optionalInteger=list2.stream().reduce((x,y)->x+y);
        System.out.println(optionalInteger.get());
        
        //anymatch, allmatch, nonematch
        boolean b = list2.stream().anyMatch(x->x%2==0);
        System.out.println(b);      //true
        boolean b2 = list2.stream().allMatch(x -> x > 0);
        System.out.println(b2);    //true
        boolean b3=list2.stream().noneMatch(x->x<0);
        System.out.println(b3);    //true
        

        //findfirst , findany
        System.out.println(list2.stream().findFirst().get());  //1
        System.out.println(list2.stream().findAny().get());    //get any number from list
       

        //**********Examples using stream********* */
        //Example 1 :  find the names whos length is greater than 3 
        List<String> names= Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x-> x.length()>3).toList());    //[Anna, Charlie, David]
        System.out.println(names.stream().filter(x-> x.length()>3).count());    //3

        //Example 2 : squareing and sorting
        List<Integer> numbers=Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());    //[1, 4, 25, 36, 81]
       


    }
}