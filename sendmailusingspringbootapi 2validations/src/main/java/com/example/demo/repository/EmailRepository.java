package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mail1;
@Repository
public interface EmailRepository extends JpaRepository<Mail1, Integer>{

}
