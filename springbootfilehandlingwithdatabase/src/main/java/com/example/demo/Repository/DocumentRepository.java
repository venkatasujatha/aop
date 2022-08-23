package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Document;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
