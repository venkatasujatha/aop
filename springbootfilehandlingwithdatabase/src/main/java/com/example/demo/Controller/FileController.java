package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FileController {
	
	
	@GetMapping("/homepage")
	public String viewPage()
	{
		return "home";
	}

}
