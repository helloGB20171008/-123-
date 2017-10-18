package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.OutPut;

@Component
public interface OutPutSevice {
	public List<OutPut> selectAll();
}
