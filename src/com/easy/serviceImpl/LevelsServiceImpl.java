package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.LevelsMapper;
import com.easy.model.Levels;
import com.easy.service.LevelsService;
@Service
public class LevelsServiceImpl implements LevelsService {

  @Autowired
  private LevelsMapper levelsMapper;
	public List<Levels> selectAll() {
		
		return levelsMapper.selectAll();
	}

}
