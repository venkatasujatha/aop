package com.example.demo.service;

import com.example.demo.model.User1;
import com.example.demo.vo.ResponseTemplateVo;

public interface UserService {

	User1 saveUser(User1 user1);

	ResponseTemplateVo getUserWithDepartment(int userid);

}
