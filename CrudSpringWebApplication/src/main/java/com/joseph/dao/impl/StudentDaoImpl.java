package com.joseph.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.joseph.dao.StudentDao;
import com.joseph.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory session;
	
	
	public void add(Student student) {
        
		session.getCurrentSession().save(student);
 
	}
	
	public void delete(int studentId) {
		
		session.getCurrentSession() .delete(getStudent(studentId));
	}
	
	public void edit(Student student) {
		session.getCurrentSession().update(student);

	}
	
	public List<Student> getAllStudent() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	
	public Student getStudent(int studentId) {
		
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

}
