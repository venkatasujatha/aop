package datastructures;

import java.util.Scanner;

public class CheckPrime {
	static boolean checkPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		if(n==2||n==3)
		{
			return true;
		}
		if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0||n%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}
	static void isPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		isPrime(a);

	}

}
