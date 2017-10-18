package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.UserMapper;
import com.easy.model.User;
import com.easy.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired 
 private UserMapper userMapper;
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

	@Override
	public User selectById(int userTe) {
		// TODO Auto-generated method stub
		return userMapper.selectById(userTe);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

}
