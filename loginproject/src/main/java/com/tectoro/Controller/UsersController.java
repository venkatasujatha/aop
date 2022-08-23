package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Service.UsersInterface;

@RestController
public class UsersController {
	@Autowired
	
	private UsersInterface usersinterface;
	
	@GetMapping("/register")
	public String getRegisterPage()
	{
		System.out.println("yes");
		return "registerpage";
	}
	
	@GetMapping("/login")
	public String getLoginPage()
	{
		return "loginpage";
	}


}
