package com.easy.mapper;

import java.util.List;

import com.easy.model.Car;

public interface CarMapper { //³µÁ¾Mapper
	                        
	public int add(Car car);
	public int delete(int carId);
	public int update(Car car);
	public List<Car> selectAll();
	public Car selectById(int carId);
    public List<Car> like(String bookname);
	public List<Car> selectFuza(Car car);
}
