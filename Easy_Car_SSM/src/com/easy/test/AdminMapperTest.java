package com.easy.test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.mapper.AdminMapper;
import com.easy.model.Adimin;

public class AdminMapperTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testselectAll() {
		AdminMapper adminMapper=(AdminMapper)applicationContext.getBean("adminMapper");
		List<Adimin>list=adminMapper.selectAll();
		System.out.println(list);
	}
	@Test
	public void testselectByname() {
		AdminMapper adminMapper=(AdminMapper)applicationContext.getBean("adminMapper");
		Adimin adimin=adminMapper.selectByname("’‘Àƒ");
		System.out.println(adimin);
	}
	@Test
	public void testadd() {
		AdminMapper adminMapper=(AdminMapper)applicationContext.getBean("adminMapper");
		Adimin adimin=new Adimin();
		adimin.setAdminUser("∞¢¿Ô");
		adimin.setAdminPw("123");
		adimin.setAdminType(1);
		int a=adminMapper.add(adimin);
		System.out.println(a+"21312313");
	}
	
}
