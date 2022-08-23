package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User1;
import com.example.demo.repository.UserRepository;
import com.example.demo.vo.Department;
import com.example.demo.vo.ResponseTemplateVo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate; 
	
	@Override
	public User1 saveUser(User1 user1) {
		
		return userRepository.save(user1);
	}

	@Override
	public ResponseTemplateVo getUserWithDepartment(int userid) {
		
		ResponseTemplateVo vo=new ResponseTemplateVo();
		User1 user1=userRepository.findById(userid).get();
		Department department=this.restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/get/"+user1.getDeptid(),Department.class);
		vo.setUser1(user1);
		vo.setDepartment(department);
		return vo;
	}
	
	

}
