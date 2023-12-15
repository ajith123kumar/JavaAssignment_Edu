package Assignment_141223;
import java.util.Scanner;

public class Fibbonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        int i;
        int j;
        int n;
        int k;
        int l;
        System.out.println("Enter the number of terms for Fibonacci series:");
        n = s.nextInt();
        System.out.println("Fibonacci Series:");

       
        	j=0;
        	k=1; 
        	for (i = 0; i < n; i++) 
            {
            System.out.print(j + " ");

            l = k + j;
            j = k;
           k = l;
        }

	}

}
