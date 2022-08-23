package com.example.demo.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

import antlr.collections.List;


@Repository
public class EmployeeRepository 
{
	@Autowired  
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public java.util.List getEmployeeInfo()
	{
		return em.createNamedStoredProcedureQuery("firstprocedure").getResultList();
		
	}
	
	public List getEmployeeInfoByCategory(String input)
	{
		return (List) em.createNamedStoredProcedureQuery("secondprocedure").setParameter("eCatagory", input).getResultList();
		
		
	}
}
