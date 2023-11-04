package com.aman.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aman.web.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{}