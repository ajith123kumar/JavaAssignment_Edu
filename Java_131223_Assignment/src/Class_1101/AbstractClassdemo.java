package Class_1101;

abstract class calc
{
	abstract public void sum(int x,int y);
	abstract public void sub(int x,int y);
calc()
{
	System.out.println("Constructor Calling");
}
}

class math extends calc
{
	@Override
	public void sum(int x,int y)
	{
		System.out.println("Sum of the values :"+(x+y));
	}
	@Override
	public void sub(int x,int y)
	{
		System.out.println("Sub of the values :"+(x-y));
	}
}
public class AbstractClassdemo {
	

	public static void main(String[] args) {
		math m = new math();
	}

}
