package javasrapractice;

import java.util.Scanner;

class RTO
{
	int age=0;
	public void AcceptInput()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("enter age");
		age =sn.nextInt();
	}
	public void verify() throws Exception
	{
		
		if(age<18)
		{
			UnderAgeException ageException=new UnderAgeException();
			ageException.NotEligible();
			throw ageException;
		}
		else if(age>50)
		{
			OverAgeException ageException1=new OverAgeException();
			ageException1.NotEligible();
			throw ageException1;
		}
		else
		{
			System.out.println("you are eligible for driving license");
		}
	}
	
	
}

class UnderAgeException extends Exception
{
	public String NotEligible()
	{
		return "you are not eligible for license";
		
	}
}
class OverAgeException extends Exception
{
	public String NotEligible()
	{
		return "your age is high so not eligible for license";
		
	}
}

public class CustomizedExceptions {

	public static void main(String[] args) {
		
		RTO rto=new RTO();
		rto.AcceptInput();
		try {
			//rto.AcceptInput();
			rto.verify();
			
		}
		catch (Exception e) {
			try {
				rto.AcceptInput();
				rto.verify();
			}
			catch (Exception e1) {
				System.out.println("you reached maximum inputs");
			}
			
		}
	}

}
