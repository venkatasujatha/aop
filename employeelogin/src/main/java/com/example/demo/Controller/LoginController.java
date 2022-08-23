package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Employee;
import com.example.demo.Service.LoginInterface;

@Controller
public class LoginController {
	
	@Autowired
	private LoginInterface loginInterface;
	
	@GetMapping("/login11")
	public String homePage()
	{
		System.out.println("yes");
		return "login";
	}
	
	@GetMapping("/welcome")
	public String welcome(ModelMap model,@RequestParam String uname,@RequestParam String psw)
	{
	
		if(loginInterface.login(uname, psw)) {
			model.put("uname", uname);
			return "welcome";
		}
		else {
			return "login";
		}
	}
	@PostMapping("/save1")
	public String save(@ModelAttribute("emp") Employee emp)
	{
		ModelAndView mav=new ModelAndView("emp");
		
		System.out.println(emp);
		loginInterface.save(emp);
		 mav.addObject("list",loginInterface.get());
		 return "redirect:/login";
	}
	
	@GetMapping("/register1")
	public String userRegister(Model model) {
		
		Employee emp=new Employee();
		model.addAttribute("list",emp);
		
		return "employeedetails";
	}

}
