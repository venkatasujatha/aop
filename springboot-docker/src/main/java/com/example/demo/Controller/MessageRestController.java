package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/show")
	public String show()
	{
		return "welcome to tectoro";
	}

}
