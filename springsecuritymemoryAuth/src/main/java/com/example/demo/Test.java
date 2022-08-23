package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
	
	public static void main(String[] args)
	{
		BCryptPasswordEncoder enc=new BCryptPasswordEncoder();
		String ep=enc.encode("sujatha");//$2a$10$DcLZCipAV3N5GkWu.aG6DuV7HZ4HQteUt0X.l8LVRIgnPoQBrj1Uq
		System.out.println(ep);
	}

}
