package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.LoginEmpRepository;

@Service
public class LoginServiceImpl implements LoginInterface{
	
	@Autowired 
	private LoginEmpRepository loginEmpRepository;

	@Override
	public Employee save(Employee emp) {
		return loginEmpRepository.save(emp);
		
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String uname, String psw) {
		loginEmpRepository.login(uname,psw);
		return false;
	}

}
