package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;
@Repository
public interface LoginEmpRepository extends JpaRepository<Employee, Integer>{

	void login(String uname, String psw);

}