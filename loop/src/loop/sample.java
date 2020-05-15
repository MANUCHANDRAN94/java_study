package loop;

import java.util.Scanner;

public class sample {
public static void main(String ar[])
{
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("Enter number of rows: "); // takes input from user
	 
	        int rows = sc.nextInt();
	         
	        for (int i= 0; i<= rows; i++)
	        {
	            for (int j=0; j<=i; j++)
	            {
	                System.out.print("# ");
	            }
	           /* for (int k=0;k<=i;k++)
	            {
	                System.out.print("*");
	            }*/ 
	                System.out.println("");
	        }
	        sc.close();
	 
	    }
	}