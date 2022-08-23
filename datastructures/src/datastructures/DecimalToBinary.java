package datastructures;

import java.util.Scanner;

public class DecimalToBinary {
	
	static String desToBinary(int n)
	{
		String b="";
		while(n>=1)
		{
		int x=n%2;
		n=n/2;
		b=x+b;
		}
		return b;
	}
	static int binaryToDecimal(String b)
	{
		int res=0;
		int powOf2=1;
		for(int i=b.length()-1;i>=0;i--)
		{
			if(b.charAt(i)=='1')
			{
					res=res+powOf2;		
			}
			powOf2=powOf2*2;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		String b= desToBinary(a);
		System.out.println(b);
		System.out.println(binaryToDecimal(b));

	}

}
