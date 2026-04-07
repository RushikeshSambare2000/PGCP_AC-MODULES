import mypack.mypack1.*;		//will import only classes and not classes under subpackages
import mypack.mypack2.Third;
import mypack.mypack1.subpack1.Fourth;

class UsePackageDemo
{
	public static void main(String args[])
	{
		First f = new First();
		f.funOfFirst();
		
		Second s = new Second();
		s.funOfSecond();
		
		Third t = new Third();
		t.funOfThird();
		
		Fourth fr = new Fourth();
		fr.funOfFourth();
	}
}
