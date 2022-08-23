package datastructures;

import java.util.Scanner;

public class Divisors2 {
	
	static void Divisors(int n)
	{
		int i=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		for(;i>=1;i--)
		{
			if(n%i==0 &&i!=n/i)
			{
				System.out.println(n/i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a =sn.nextInt();
		Divisors(a);
		

	}

}
