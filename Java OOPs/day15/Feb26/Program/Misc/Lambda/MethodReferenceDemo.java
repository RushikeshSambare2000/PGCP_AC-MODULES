
interface Consumer<T>
{
	void accept(T a);
}

interface Supplier<T>
{
	T supply();
}

class Demo 
{
	static void print(String s)
	{
		System.out.println(s);
	}
}

class MethodReferenceDemo
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
		
		//Anonymous inner class for Supplier<Demo>
		Supplier<Demo> sup1 = new Supplier<Demo>(){
			public Demo supply()
			{
				return new Demo();
			}
		};
		
		//Lambda expression for Supplier<Demo>
		//Supplier<Demo> sup2 = () -> new Demo();
		Supplier<Demo> sup2 = Demo::new;
		Demo d = sup2.supply();
		d.print("Hello guys, how are you!!");
		
	}
}
