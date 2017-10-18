package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.AdminMapper;
import com.easy.model.Adimin;
import com.easy.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public List<Adimin> selectAll() {
		
		return adminMapper.selectAll();
	}
	@Override
	public Adimin selectByname(String adminUser ) {
		
		return adminMapper.selectByname(adminUser);
	}
	@Override
	public int add(Adimin adimin) {
		
		return adminMapper.add(adimin);
	}
 
}
