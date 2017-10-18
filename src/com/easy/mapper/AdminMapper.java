package com.easy.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Adimin;
@Component
public interface AdminMapper {
	public List<Adimin> selectAll();
	public int  add(Adimin adimin);
	public Adimin  selectByname(String adminUser);
}
