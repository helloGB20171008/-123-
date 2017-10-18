package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.BrandMapper;
import com.easy.model.Brand;
import com.easy.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
   @Autowired
	private BrandMapper brandMapper;
	public List<Brand> selectAll() {
		return brandMapper.selectAll();
	}

}
