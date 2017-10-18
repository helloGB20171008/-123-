package com.easy.test;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.easy.mapper.StructureMapper;
import com.easy.model.Structure;

public class StructureMapperTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testselectAll() {
		StructureMapper structureMapper=(StructureMapper)applicationContext.getBean("structureMapper");
		List<Structure> brandlist=structureMapper.selectAll();
		System.out.println(brandlist);
		
	}

}
