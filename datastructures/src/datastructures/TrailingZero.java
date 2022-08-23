package datastructures;

import java.util.Scanner;

public class TrailingZero {
	
	static int Trailing(int n)
	{
		int res=0;
		int powerOf5=5;
		while(n>=powerOf5)
		{
		res=res+(n/powerOf5);
		powerOf5=powerOf5*5;
	    }
	    return res;
	}
	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sn.nextInt();
		System.out.println(Trailing(n));

	}

}
