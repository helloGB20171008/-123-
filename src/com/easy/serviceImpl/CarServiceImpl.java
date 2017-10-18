package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.CarMapper;
import com.easy.model.Car;
import com.easy.service.CarService;
@Service 
public class CarServiceImpl implements CarService {
	@Autowired
	private CarMapper carMapper;
	public int add(Car car) {
		
		return carMapper.add(car);
	}

	
	public int delete(int carId) {
		return carMapper.delete(carId);
	}

	@Override
	public int update(Car car) {	
		return carMapper.update(car);
	}

	@Override
	public List<Car> selectAll() {
		return carMapper.selectAll();
	}

	@Override
	public Car selectById(int carId) {
		// TODO Auto-generated method stub
		return carMapper.selectById(carId);
	}

	@Override
	public List<Car> selectFuza(Car car) {
		List<Car> selectFuzalistcar = carMapper.selectFuza(car);
		return selectFuzalistcar;
	}

}
