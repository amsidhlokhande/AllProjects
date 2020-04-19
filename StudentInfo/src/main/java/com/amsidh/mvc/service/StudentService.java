package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.entities.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	public void saveStudent(Student student);
}
