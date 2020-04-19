package com.amsidh.mvc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amsidh.mvc.dao.UserDao;
import com.amsidh.mvc.domain.User;
import com.amsidh.mvc.services.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public boolean deleteUser(Integer userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User getUserByUserId(Integer userId) {
		return userDao.getUserByUserId(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
