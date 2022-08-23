package datastructures;

import java.util.Scanner;

public class Divisors1 {
	static void Divisors(int n)
	{
		
		for(int i=0;i*i<=n;i++)
		{
		try {	
			
		if(n%i==0)
		{
			System.out.println(i);
			if(i!=n/i)
			{
			System.out.println(n/i);
			}
		}
		
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		Divisors(a);
		
	}

}
