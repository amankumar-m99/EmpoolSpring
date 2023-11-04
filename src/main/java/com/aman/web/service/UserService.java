package com.aman.web.service;

import java.util.List;

import com.aman.web.entity.User;

public interface UserService {
	List<User> getUsers();

	User getUser(int userId);

	User addEmployee(User user);

	User updateEmployee(User employee);

	void deleteEmployee(int userId);
	
}
