package com.example.demo.Office.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Office.Office;
@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer>{

}
