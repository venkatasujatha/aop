package datastructures;

import java.util.Scanner;

public class PrimeFactors {
	
	static void primeFactor(int n)
	{
		int i=2;
		while(i*i<=n)
		{
		while(n%i==0)
		{
			System.out.println(i);
			n=n%i;
		}
		i++;
		}
		if(n>1)
		{
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sn.nextInt();
		primeFactor(n);
	}

}
