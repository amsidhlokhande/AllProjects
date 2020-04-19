package com.amsidh.mvc.service;

import com.amsidh.mvc.model.User;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(String username);

	public User updateUser(User user);
}
