package com.aman.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aman.web.entity.User;
import com.aman.web.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() {
		return "home page of my user application";
	}

	@GetMapping("/users")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}

	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable String userId) {
		return this.userService.getUser(Integer.parseInt(userId));
	}

	@PostMapping(path = "/user", consumes = "application/json")
	public User addEmployee(@RequestBody User employee) {
		return this.userService.addEmployee(employee);
	}

	@PutMapping("/user")
	public User updateEmployee(@RequestBody User employee) {
		return this.userService.updateEmployee(employee);
	}

	@DeleteMapping("/user/{userId}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String userId) {
		try {
			this.userService.deleteEmployee(Integer.parseInt(userId));
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
