package com.amsidh.mvc.dao;

import java.util.List;

import com.amsidh.mvc.domain.User;

public interface UserDao {
	public boolean addUser(User user);

	public boolean deleteUser(Integer userId);

	public User updateUser(User user);

	public User getUserByUserId(Integer userId);

	public List<User> getAllUsers();

}
