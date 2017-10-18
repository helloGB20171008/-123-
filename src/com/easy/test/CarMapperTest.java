package com.easy.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.mapper.CarMapper;
import com.easy.model.Car;

public class CarMapperTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		 applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testadd() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		Car car =new Car();
		car.setBrandId(1);
		car.setDiscount(100.5);
		car.setGearId(2);
		car.setImage("aodi");
		car.setLevelId(1);
		car.setOriginal(110);
		car.setOutId(1);
		car.setSeat(5);
		car.setStrId(1);
		car.setTypeId(1);
		int a=carMapper.add(car);
		System.out.println(123);
	}
	@Test
	public void testupdate() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		Car car =new Car();
	    car.setCarId(1);
		car.setBrandId(3);
		car.setDiscount(100.5);
		car.setGearId(2);
		car.setImage("aodi");
		car.setLevelId(1);
		car.setOriginal(110);
		car.setOutId(1);
		car.setSeat(5);
		car.setStrId(1);
		car.setTypeId(1);
		int a=carMapper.update(car);
	}
	
	@Test
	public void testdelete() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		int a= carMapper.delete(14);
		System.out.println(456);
	}
	@Test
	public void testselectAll() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		List<Car> carlist=carMapper.selectAll();
		System.out.println(carlist);
	}
	@Test
	public  void  testselectById() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		Car car=carMapper.selectById(2);
		System.out.println(car);
	}
	@Test
	public  void  testselectFuza() {
		CarMapper carMapper=(CarMapper)applicationContext.getBean("carMapper");
		Car car=new Car();
//		car.setBrandId(1);
		List<Car>  carlist=carMapper.selectFuza(car);
		System.out.println(carlist);
	}
}
