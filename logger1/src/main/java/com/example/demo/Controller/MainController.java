package com.example.demo.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	private static final Logger logger=Logger.getLogger(MainController.class);
	
	@GetMapping("/home")
	public String home()
	{
		logger.info("this is info message");
		//logger.debug("this is debug message");
		logger.error("this is error message");
		return "success";
		
	}

}
