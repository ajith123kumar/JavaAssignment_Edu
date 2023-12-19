package Assignment_181223;

import java.util.Scanner;

public class marks {
	static int m1, m2, m3, m4;
	static int tot;
	static double avg;

	static {
		m1 = 85;
		m2 = 90;
		m3 = 78;
		m4 = 92;
	}

	static void calculate() 
	{
		tot = m1 + m2 + m3 + m4;
		avg = tot/4;
	}
	static void printValues() 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Please Enter the Name of the Student");
		String name=s.nextLine();
		if(name.equals("Ajith"))
		{
			System.out.println("The Marks of the Student "+name);
			System.out.println("Marks: ");
			System.out.println("m1: " + m1);
			System.out.println("m2: " + m2);
			System.out.println("m3: " + m3);
			System.out.println("m4: " + m4);
			System.out.println("Total: " + tot);
			System.out.println("Average: " + avg);
		}
		else
		{
			System.out.println("Wrong Student Name");

		}
	}

	public static void main(String[] args) 
	{
		System.out.println("welcome!");
		calculate();
		printValues();

	}

}
