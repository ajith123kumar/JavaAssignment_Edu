package Assignment_131223;
import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);

		System.out.println("Welcome to the ODD or EVEN Program");
		System.out.println("Enter the Number");

		int a = c.nextInt();
if(a % 2 ==0)
{
	System.out.println("The Number = " +a+" is EVEN number");

}
else
{
	System.out.println("The Number = " +a+ " is ODD number");

}
	}

}
