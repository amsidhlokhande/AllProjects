/**
 * 
 */
package com.amsidh.mvc.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dao.UserDao;
import com.amsidh.mvc.model.User;

/**
 * @author AMSIDH
 * 
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.mvc.dao.UserDao#addUser(com.amsidh.mvc.model.User)
	 */
	@Override
	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.mvc.dao.UserDao#deleteUser(java.lang.String)
	 */
	@Override
	public void deleteUser(String username) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(session.get(User.class, username));
		session.getTransaction().commit();
		session.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.mvc.dao.UserDao#updateUser(com.amsidh.mvc.model.User)
	 */
	@Override
	public User updateUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.mvc.dao.UserDao#findByUserName(java.lang.String)
	 */
	@Override
	public User findByUserName(String username) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, username);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
