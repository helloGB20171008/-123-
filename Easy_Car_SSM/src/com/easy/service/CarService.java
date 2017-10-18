package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Car;
@Component
public interface CarService {//������Ϣ��ҵ���߼��� 
	public int add(Car car);//�����ķ���ֵ����int��Ϊ�˷�������ʹ�õ� 
	public int delete(int carId);
	public int update(Car car);
	public List<Car> selectAll();
	public Car  selectById(int carId);
	public List<Car> selectFuza(Car car);

}
