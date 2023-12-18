package Assignment_151223;
import java.util.Scanner;


public class Student_details {
	public static void Stud()
	{

		int sid=001;
		int roll=1;
		String Stuname="Ajith Kumar";
		String Stream="Bio-Maths";
		int Tot=498;
		int perc = Tot/5;
		String mobno="9677766666";
		String add="Chennai";
		System.out.println("Studenid: "+sid);
		System.out.println("");
		System.out.println("Name of the Student : "+Stuname);
		System.out.println("");
		System.out.println("Roll No: "+roll);
		System.out.println("");
		System.out.println("Stream: "+Stream);
		System.out.println("");
		System.out.println("Mobile No: "+mobno);
		System.out.println("");
		System.out.println("Address of the Student: "+add);
		System.out.println("");
		System.out.println("Total Marks of the Student: "+Tot);
		System.out.println("");
		System.out.println("Percentage: "+perc);
		}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		Student_details stu = new Student_details();
		
		System.out.println("Welcome Student portal");

		System.out.println("Please Enter your Username");
		String user =Sc.nextLine();
		System.out.println("Please Enter your Password");
		String pass =Sc.nextLine();
		
		if((user.equals("Ajith")) && (pass.equals("Passw0rd")))
		{

			stu.Stud();
		}
		else
		{
			System.out.println("Wrong User");

		}
	}
}