package com.easy.test;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.mapper.CarTypeMapper;

import com.easy.model.CarType;


public class CarTypeMapperTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testselectAll() {
		CarTypeMapper carTypeMapper=(CarTypeMapper)applicationContext.getBean("carTypeMapper");
		List<CarType> brandlist=carTypeMapper.selectAll();
		System.out.println(brandlist);
		
	}

}
