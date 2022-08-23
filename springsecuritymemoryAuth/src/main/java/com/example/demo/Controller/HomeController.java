package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@GetMapping("/welcome")
	public String showWelcome()
	{
		return "WelcomePage";
	}
	@GetMapping("/home")
	public String showHome()
	{
		return "HomePage";
	}
	@GetMapping("/admin")
	public String showAdmin()
	{
		return "AdminPage";
	}
	@GetMapping("/emp")
	public String showEmp()
	{
		return "EmpPage";
	}
	@GetMapping("/std")
	public String showStudent()
	{
		return "Std";
	}
	@GetMapping("/denied")
	public String showDenied()
	{
		return "Denied";
	}
}
