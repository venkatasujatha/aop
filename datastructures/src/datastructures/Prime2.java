package datastructures;

import java.util.Scanner;

public class Prime2 {
	
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

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		System.out.println(checkPrime(a));
	}

}
