package com.tectoro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String home()
	{
		System.out.println("yes");
		return "login";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcome(ModelMap model,@RequestParam String userid,@RequestParam String password)
	{
		if(userid.equals("admin")&&password.equals("root"))
		{
			return "welcome";
		}
		model.put("error msg", "pls mentioned correct userid and password");
		return "login";
		
	}
	
	
	

}
