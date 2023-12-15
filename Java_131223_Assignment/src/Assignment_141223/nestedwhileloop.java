package Assignment_141223;
import java.util.Scanner;

public class nestedwhileloop {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n; // Adjust the number of rows as needed

       System.out.println("Enter the no Rows");
       n = s.nextInt();
       System.out.println("The Rightside Pyramid");
              
       int i = 1;
        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }

            System.out.println();
            i++;
        }
        }
}
