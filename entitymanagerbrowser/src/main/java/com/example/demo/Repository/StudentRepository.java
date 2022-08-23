package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	Optional<Student> findByRollno(int rollno);

}
