package Assignment_131223;
import java.util.Scanner;

public class markResults {
//	Scanner c = new Scanner(System.in);
	String name;
	public static void main(String[] args)
	{
	Scanner d = new Scanner(System.in);

		markResults m = new markResults();
			
		
		String stu1= "Ajith";
		String stu2= "Dhoni";
		String stu3= "Barry";
		
		
		System.out.println("Welcome To Results, You can Calculate resuls here");
		System.out.println("Please Enter the Name of the Student");

		m.name = d.nextLine();
		System.out.println("Name of the Student is "+m.name);

		if(m.name.equals(stu1))
		{
		m.test();
		}
		else if(m.name.equals(stu2))
		{
		m.test();
		}
		else if(m.name.equals(stu3))
		{
		m.test();
		}
		else
		{
			System.out.println("Wrong Student name");
		}
		
}


void test()
	{
	markResults m = new markResults();

	String n1 = m.name;	
	
			Scanner c = new Scanner(System.in);
		
		int m1, m2, m3 ,m4 , m5, Tot;
		float p;
		
			System.out.println("Please Enter the Tamil Marks(Max 100)");
			m1 = c.nextInt();
			System.out.println("Please Enter the English Marks(Max 100)");
			m2 = c.nextInt();
			System.out.println("Please Enter the Maths Marks(Max 100)");
			m3 = c.nextInt();
			System.out.println("Please Enter the Science Marks(Max 100)");
			m4 = c.nextInt();
			System.out.println("Please Enter the Social Marks(Max 100)");
			m5 = c.nextInt();
			Tot = m1+m2+m3+m4+m5;
			p = Tot/5;
if(m1<40 || m2<40 || m3<40 || m4<40 || m5<40)
{
if(m1<40)
{
	System.out.println("You Failed in Tamil");
}

if(m2<40)
{
	System.out.println("You Failed in English");
}
if(m3<40)
{
	System.out.println("You Failed in Maths");
}
if(m4<40)
{
	System.out.println("You Failed in Science");
}
if(m5<40)
{
	System.out.println("You Failed in Social");
}
}
else
{
	System.out.println("You Passed in all subjects");
			
}


System.out.println("The Student " + n1 + " Total marks is " +Tot+ " Percentage " +p + "%");
	
}
}

