package com.example.demo.Controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class EmployeeController {
	
	@GetMapping("/showpage")
	public String show()
	{
		if(new Random().nextInt(10)<5)
		
			throw new RuntimeException();
		System.out.println("error msg");
		return "Error";
	}
	
	@GetMapping("/wshow")
	public String showPage()
	{
		
		return "Welcome";
	}
	
	
}
