package datastructures;

import java.util.Scanner;

public class Prime {
	static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
	
		System.out.println("enter a number");
		int a=sn.nextInt();
		System.out.println(isPrime(a));
	}

}
