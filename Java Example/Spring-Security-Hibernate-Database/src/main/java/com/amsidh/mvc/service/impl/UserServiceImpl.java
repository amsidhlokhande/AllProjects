package com.amsidh.mvc.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amsidh.mvc.dao.UserDao;
import com.amsidh.mvc.model.User;
import com.amsidh.mvc.model.UserRole;
import com.amsidh.mvc.service.UserService;

@Service
public class UserServiceImpl implements UserDetailsService,UserService,BeanNameAware  {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		com.amsidh.mvc.model.User user = userDao.findByUserName(username);

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for(UserRole role:user.getUserRole())
		{
			authorities.add(new SimpleGrantedAuthority(role.getRole()));	
		}
		
		org.springframework.security.core.userdetails.User u = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				user.isEnabled(), true, true, true, authorities);
		return u;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Created Bean Name :"+name);
		
	}

	
	
	
	
}
