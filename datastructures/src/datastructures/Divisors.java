package datastructures;

import java.util.Scanner;

public class Divisors {
	static void printDivisors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		printDivisors(a);
		

	}

}
