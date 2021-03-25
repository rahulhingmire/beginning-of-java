package first;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a,i=1,result=1;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			result=result*i;
			
		}
		System.out.println("the factorial of number is:"+ result);
		
				
		

	}

}
