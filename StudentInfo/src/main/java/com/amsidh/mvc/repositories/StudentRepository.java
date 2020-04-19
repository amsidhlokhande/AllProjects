package com.amsidh.mvc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
