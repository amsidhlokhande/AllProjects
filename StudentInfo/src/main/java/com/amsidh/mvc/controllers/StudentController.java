package com.amsidh.mvc.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amsidh.mvc.entities.Student;
import com.amsidh.mvc.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	Logger logger = Logger.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	public StudentController() {
		logger.info("Loading StudentController!!!!!");
	}

	@RequestMapping(value = { "/allStudents" }, method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Student>> getAllStudent() {
		System.out.println("Inside getAllStudent Method!!!!!!");
		logger.info("Inside getAllStudent Method!!!!!!");
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}

	@RequestMapping(value = { "/saveStudent" }, method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Student>> saveStudent(@RequestBody(required=true) Student student) {

		System.out.println("Inside saveStudent Method!!!!!!" + student.toString());
		logger.info("Inside saveStudent Method!!!!!! And Saving student : " + student.toString());

		studentService.saveStudent(student);
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}
}
