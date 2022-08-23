package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController 
{
	
	@Autowired
	StudentService studentService;
	
	@PersistenceContext
	EntityManager entityManager;
	
	//add student details
	@PostMapping("/save")
	public Student save(@RequestBody Student student)
	{
		return studentService.add(student);
	}
	
	//get all student details
	
	@GetMapping("/nativequery")
	public List<Student> getStudents()
	{
		String s="select c from Student c";
		Query bbbb = entityManager.createQuery(s);
		 return bbbb.getResultList();
		 
	}
	
	//get student details by rollno
	
	@GetMapping("/get/{rollno}")
	public Student getStudentsByRollno(@PathVariable int rollno)
	{
		return entityManager.find(Student.class, rollno);
	}
	
	// update student name by rollno
	@PutMapping("/get11/{rollno}")
	public Object updateStudent(@PathVariable int rollno)
	{
		Student find = entityManager.find(Student.class, rollno);
		find.setRollno(rollno);
		System.out.println(find);
		return find;
	}
	
	
	
	
	
	
	
	
	
	
}
