package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Brand;

@Component
public interface BrandService {
	public List<Brand> selectAll();
}
