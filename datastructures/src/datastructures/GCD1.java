package datastructures;

import java.util.Scanner;

public class GCD1 {
	
	static int GCD(int a,int b)
	{
		int min=0;
		if(a<b)
		{
			min=a;
		}
		else
		{
			min=b;
		}
		for(int i=min;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				return i;
			}
		}
		return 1;
		
	}

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sn.nextInt();
		System.out.println("enter 2nd number");
		int b=sn.nextInt();
		System.out.println(GCD(a,b));
	}

}
