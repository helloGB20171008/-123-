package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Adimin;

@Component
public interface AdminService {//admin��ҵ���߼���service
	public List<Adimin> selectAll();
	public Adimin selectByname(String adminUser);
	public int add(Adimin adimin);
}
