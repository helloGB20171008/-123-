package com.easy.mapper;

import java.util.List;

import com.easy.model.User;

public interface UserMapper {
	public List<User> selectAll();
	public int  add(User user);
	public User  selectById(int  userTe);
}
