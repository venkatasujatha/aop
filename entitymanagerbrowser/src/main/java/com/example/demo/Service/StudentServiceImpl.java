package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;
	

	@Override
	public Student add(Student student) {
		
		return repository.save(student);
	}


	@Override
	public List<Student> get() {
		
		return repository.findAll();
	}


	@Override
	public Optional<Student> getStudentsByRollno(int rollno) {
		
		return repository.findByRollno(rollno);
	}

	public Object updateStudent(@PathVariable int rollno)
	{
		return repository.findByRollno(rollno);
	}
	
}
