package com.amsidh.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.entities.Student;
import com.amsidh.mvc.repositories.StudentRepository;
import com.amsidh.mvc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	private static final List<Student> students = new ArrayList<Student>();
	static {
		students.add(new Student(1, "Amsidh", "BE"));

	}

	@Override
	public List<Student> getAllStudent() {
		 return studentRepository.findAll();
		//return students;
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
		//students.add(student);
	}

}
