package com.pramodya.hfms.repository;

import com.pramodya.hfms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,String> {



    }
