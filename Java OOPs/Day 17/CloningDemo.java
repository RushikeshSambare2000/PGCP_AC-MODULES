class demo{
    int a;
    demo(int a){
     this.a=a;
    }
      public String toString(){
        return "demo [a="+a+"]";
    }

    public Object clone() throws CloneNotSupportedException
	{
		demo d = (demo) super.clone();
		return d;
	}
    
}

class first implements Cloneable{
    int b;
    demo d ;
    first(int b, demo d){
        this.b=b;
        this.d=d;
    }

    public Object clone() throws CloneNotSupportedException
	{
		first f = (first)super.clone();	//creating and returning reference of cloned object here
		f.d = (demo)this.d.clone();
		return f;
	}

    public String toString(){
        return "First[b="+b+", d="+d+"]";
    }


}

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
       demo d1 = new demo(10);
		first f1 = new first(15,d1);
		System.out.println("f1: "+f1);
		
		first f2 = (first)f1.clone();
		System.out.println("f2: "+ f2);
		
		f2.b = 20;
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
		
		f1.d.a = 25;
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
        }
    }

