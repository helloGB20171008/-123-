package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.CarTypeMapper;
import com.easy.model.CarType;
import com.easy.service.CarTypeSevice;
@Service
public class CarTypeServiceImpl implements CarTypeSevice {
	@Autowired
	private CarTypeMapper carTypeMapper;
	public List<CarType> selectAll() {
		
		return carTypeMapper.selectAll();
	}
  
}
