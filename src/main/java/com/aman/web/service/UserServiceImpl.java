package com.aman.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.web.dao.UserDao;
import com.aman.web.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(int userId) {
		return userDao.getReferenceById(userId);
	}

	@Override
	public User addEmployee(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateEmployee(User user) {
		return userDao.save(user);
	}

	@Override
	public void deleteEmployee(int userId) {
		userDao.deleteById(userId);
	}

}
