
class teacher{
    int id;
    String name;

    teacher(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String toString()
	{
		return "[" + this.id + "," + this.name + "]";		// [1,Raj]
	}
    
}

class gen<T>{
T obj;

gen(T obj){
  this.obj=obj;
}

public T getObj() {
    return obj;
}
}
public class GenricDemo {
    public static void main(String[] args) {
        gen<Integer> obj2= new gen<Integer>(15);
        Integer obj3=obj2.getObj();
        System.out.println(obj3);
        System.out.println(obj3.getClass().getName());

        gen<Character> obj4 = new gen<Character>('R');
        Character obj5 = obj4.getObj();
        System.out.println(obj5);


        teacher t1= new teacher(101, "Russhikesh");
        gen<teacher> obj6 = new gen<teacher>(t1);
        teacher t11= obj6.getObj();
        System.out.println(t11.id);
        System.out.println(t11.getClass().getName());

    }
}
