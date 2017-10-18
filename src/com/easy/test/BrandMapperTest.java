package com.easy.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.mapper.BrandMapper;
import com.easy.model.Brand;

public class BrandMapperTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testselectAll() {
		BrandMapper brandMapper=(BrandMapper)applicationContext.getBean("brandMapper");
		List<Brand> brandlist=brandMapper.selectAll();
		System.out.println(brandlist);
		
	}

}
