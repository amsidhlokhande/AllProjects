package com.amsidh.mvc.dao;

import com.amsidh.mvc.model.User;

public interface UserDao {
   
	public void addUser(User user);

	public void deleteUser(String username);

	public User updateUser(User user);
	
	public User findByUserName(String username);
   
}
