package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;


import com.easy.model.CarType;

@Component
public interface CarTypeSevice {
	public List<CarType> selectAll();
}
