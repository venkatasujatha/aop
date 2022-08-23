package datastructures;

import java.util.Scanner;

public class LCD {
	
	static int findLcm(int a,int b)
	{
		return (a*b)/GCD(a,b);
	}
	
	static int GCD(int a,int b)
	{
	
		while(a!=0 && b!=0)
		{
			if(a>b)
		{
			a=a%b;
		}
		else
		{
			b=b%a;
		}
		}
		if(a!=0)
		{
			return a;
		}
		else
		{
			return b;
		}
		}
	
	
	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sn.nextInt();
		System.out.println("enter 2nd number");
		int b=sn.nextInt();
		System.out.println(findLcm(a,b));
		
	}

}
