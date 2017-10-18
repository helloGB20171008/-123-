package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Car;
@Component
public interface CarService {//车辆信息的业务逻辑层 
	public int add(Car car);//方法的返回值类型int是为了返回序列使用的 
	public int delete(int carId);
	public int update(Car car);
	public List<Car> selectAll();
	public Car  selectById(int carId);
	public List<Car> selectFuza(Car car);

}
