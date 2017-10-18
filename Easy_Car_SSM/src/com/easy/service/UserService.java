package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.User;

@Component
public interface UserService {
	public List<User> selectAll();
	public User selectById(int userTe);
	public int add(User user);
}
