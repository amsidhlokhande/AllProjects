package com.amsidh.mvc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dao.UserDao;
import com.amsidh.mvc.domain.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Serializable serializable = session.save(user);
		session.getTransaction().commit();
		session.close();
		return serializable.equals(user);
	}

	@Override
	public boolean deleteUser(Integer userId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			session.delete(userId.toString(), User.class);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			session.getTransaction().commit();
			session.close();
		}

	}

	@Override
	public User updateUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(user);
			return user;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			session.getTransaction().commit();
			session.close();
		}

	}

	@Override
	public User getUserByUserId(Integer userId) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = (User) session.get(User.class, userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");

		List<User> userList = (List<User>) query.list();
		session.getTransaction().commit();
		session.close();
		return userList;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
