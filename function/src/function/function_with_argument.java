package function;

import java.util.Scanner;

public class function_with_argument {
	public static void main(String ar[])
	{ Scanner s1=new Scanner(System.in);
		System.out.println("enter two value: ");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int result=0;
		result=sum(a,b);
		System.out.println("\n the sum is: "+result);
		
		
	}
	
	static int sum(int x,int y) {
		int add=0;
		add=x+y;
		return add;
	}

}
