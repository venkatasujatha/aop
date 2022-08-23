package com.tectoro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Users;
import com.tectoro.Repository.UsersRepository;
@Service
public class UserServiceImpl implements UsersInterface{
	
	@Autowired
	private UsersRepository usersRepository;
	
	
	
	@Override
	public Users registerUser(String login, String password, String email) {
		{
			if(login!=null || password!=null)
			{ 
				return null;
			}
				
			
			else
			{
				Users user=new Users();
				user.setEmail(email);
				user.setLogin(login);
				user.setPassword(password);
				return usersRepository.save(user);
			}
			
		}
		
	}
	
	public Users Authenticate(String login,String password)
	{
		return usersRepository.findByLoginAndPassword(login, password).orElse(null);
		
	}

}
