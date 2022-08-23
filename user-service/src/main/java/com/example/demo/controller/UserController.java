package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User1;
import com.example.demo.service.UserService;
import com.example.demo.vo.ResponseTemplateVo;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveuser")
	public User1 saveUser(@RequestBody User1 user1)
	{
		return userService.saveUser(user1);
	}
	
	@GetMapping("/getuser/{userid}")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable int userid)
	{
		return userService.getUserWithDepartment(userid);
	}
}
