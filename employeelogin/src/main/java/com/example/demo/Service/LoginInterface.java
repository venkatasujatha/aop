package com.example.demo.Service;

import com.example.demo.Model.Employee;

public interface LoginInterface {

	Employee save(Employee emp);

	Object get();

	boolean login(String uname, String psw);

}
