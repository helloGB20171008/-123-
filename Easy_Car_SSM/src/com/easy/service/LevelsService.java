package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Levels;

@Component
public interface LevelsService {
	public List<Levels> selectAll();
}
