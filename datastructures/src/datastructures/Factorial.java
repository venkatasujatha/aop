package datastructures;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
		res *= i;
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sn.nextInt();
		System.out.println(fact(n));
		
	}

}
