package Assignment_9_231223;

import java.util.Scanner;

public class MultiStringArray {

	public static void main(String[] args) 
	{
		String name[][]= {{"Ajith","Hari","Dhoni"},
					{"Kumar","Haran","Mahi"},
					{"Superman","Flash","Batman"}};
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		int n = 0;
		
		for(int i=0;i<name.length;i++)
		{
			for (int j=0;j<name.length;j++)
			{
	            if(name[i][j].equals("Ajith"))
	            {
	            	n++;
	            }
	         
			}
		}
			 if (n>0) 
			 { 
				   System.out.println("value found");
			 }
			 else 
			 {	   
				   System.out.println("not found");
			 } 
		
	}	

}
