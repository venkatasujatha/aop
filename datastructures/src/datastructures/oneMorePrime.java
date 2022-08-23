package datastructures;

import java.util.Scanner;

public class oneMorePrime {
	static void primeNum(int n)
	{
		boolean[] prime=new boolean[n+1];
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					prime[j]=true;
					
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		primeNum(a);

	}



}
