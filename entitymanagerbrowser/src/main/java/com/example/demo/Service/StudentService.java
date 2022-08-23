package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Student;

public interface StudentService {

	Student add(Student student);

	List<Student> get();
	
	//public Optional<Student> getStudentsById(int rollno);

	Optional<Student> getStudentsByRollno(int rollno);

}
