
interface Consumer<T>
{
	void accept(T a);
}

interface MyInterface <T1,T2>
{
	void doSomething(T1 a, T2 b);
}

class Demo 
{
	int a;
	
	Demo(){}
	
	Demo(int a)
	{
		this.a = a;
	}
	
	static void print(String s)
	{
		System.out.println(s);
	}
	
	void doSum(Integer a, Integer b)
	{
		int res = a + b;
		System.out.println(res);
	}
	
	void oneFun(Demo d)
	{
		int res = this.a * d.a;
		System.out.println("oneFun of Demo : " + res);
			
	}
	
	static void twoFun(Consumer<String> c)
	{
		c.accept("Hi guys, how are you");
	}
	
}



class MethodReferenceDemo1
{
	public static void main(String args[])
	{
		//Anonymous inner class for Consumer<T>
		
		Consumer<String> cons1 = new Consumer<String>(){
			public void accept(String s)
			{
				//System.out.println(s);
				Demo.print(s);
			}
		};
		
		cons1.accept("Hello guys!!");
		
		//Lambda expression for Consumer<String>
		//Consumer<String> cons2 = (s) -> System.out.println(s);
		//Consumer<String> cons2 = s -> System.out.println(s);
		//Consumer<String> cons2 = System.out::println;		//object::non-static method
		Consumer<String> cons2 = Demo::print;			//class::static method
		cons2.accept("Welcome friends!!");
		
		//Passing lambda expression as argument as FunctionalInterface implementation
		//Demo.twoFun(cons2);
		//Demo.twoFun(s -> System.out.println(s));
		//Demo.twoFun(System.out::println);
		Demo.twoFun(Demo::print);
		
		//Anonymous Inner class for MyInterface<Integer, Integer>
		MyInterface <Integer,Integer> mif1 = new MyInterface<Integer,Integer>(){
			public void doSomething(Integer p, Integer q)
			{
				new Demo().doSum(p,q);
			}
		};
		
		mif1.doSomething(15,35);
		
		//Lambda expression for MyInterface<Integer,Integer>
		//MyInterface <Integer,Integer> mif2 = (p,q) -> {new Demo().doSum(p,q); };
		MyInterface <Integer,Integer> mif2 = new Demo()::doSum;
		mif2.doSomething(25,15);
		
		//Anonymous Inner class for MyInterface<Demo, Demo>
		MyInterface <Demo,Demo> mif3 = new MyInterface<Demo,Demo>(){
			public void doSomething(Demo p, Demo q)
			{
				p.oneFun(q);
			}
		};
		
		Demo d1 = new Demo(3);
		Demo d2 = new Demo(5);
		
		mif3.doSomething(d1,d2);
		
		//Lambda expression for MyInterface<Demo, Demo>
		//MyInterface <Demo,Demo> mif4 = (p, q) -> { p.oneFun(q); };
		//MyInterface <Demo,Demo> mif4 = (p, q) -> p.oneFun(q);
		MyInterface <Demo,Demo> mif4 = Demo::oneFun;	//Internally (p, q) -> p.oneFun(q);
		
		d1 = new Demo(6);
		d2 = new Demo(8);
		
		mif4.doSomething(d1,d2);
		
		
	}
}
