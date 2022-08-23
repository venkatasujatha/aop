package com.tectoro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Users;
import com.tectoro.Repository.UsersRepository;

public interface UsersInterface {
	
	
	public Users registerUser(String login,String password,String email);
	

}
