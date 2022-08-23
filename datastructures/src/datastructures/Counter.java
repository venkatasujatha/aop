package datastructures;

import java.util.Scanner;

public class Counter {
	
	static int countDigits(int n)
	{
		int count=0;
		while(n>0)
		{
		n=n/10;
		count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sn.nextInt();
		System.out.println(countDigits(i));
		
	}

}
