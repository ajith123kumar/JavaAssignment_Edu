package Assignment_131223;

import java.util.Scanner;

public class voterQualification {
	public static void main(String[] args)
	{
	Scanner d = new Scanner(System.in);
//	voterQualification v = new voterQualification();
	System.out.println("Welcome Voter");
	System.out.println("Please Enter your Name");
	String name = d.nextLine();
	System.out.println("Please Enter your Age");
	int Age = d.nextInt();
	System.out.println("Please Choose one Proof Aadhar,PAN,Voter,License");
	String Proof = d.next();
	System.out.println("Your Choosen Proof is "+Proof);
	
	
	if(Age >= 18 && Proof.equals("Aadhar"))
	{
		System.out.println("Dear "+name+" You are Age is eligible for Vote, and you can use Aadhar card as Proof");
}
	else if(Age >= 18 && Proof.equals("PAN"))
	{
		System.out.println("Dear "+name+" You are Age is eligible for Vote, and you can use PAN card as Proof");

}
	else if(Age >= 18 && Proof.equals("Voter"))
		{
			System.out.println("Dear "+name+" You are Age is eligible for Vote, and you can use VoterID card as Proof");

	}
		else if(Age >= 18 && Proof.equals("License"))
			{
				System.out.println("Dear "+name+" You are Age is eligible for Vote, and you can use License as Proof");

		}
		else
		{
			System.out.println("You are not eligible to Vote");
		}
		
}
}