import mypack.subpack1.Second;
import mypack.subpack2.Third;
import mypack.subpack2.Fourth;

class AccessSpecifierDemo
{
	public static void main(String args[])
	{
		//Second s = new Second();
		//s.funOfSecond();
		
		//Third t = new Third();
		//t.funOfThird();
		
		Fourth ft = new Fourth();
		ft.funOfFourth();

	}
}
