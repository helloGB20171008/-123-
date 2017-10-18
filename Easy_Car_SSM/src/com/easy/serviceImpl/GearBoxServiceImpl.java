package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.GearBoxMapper;
import com.easy.model.GearBox;
import com.easy.service.GearBoxService;
@Service
public class GearBoxServiceImpl  implements GearBoxService{

	@Autowired
	private GearBoxMapper gearBoxMapper;
	public List<GearBox> selectAll() {
		return gearBoxMapper.selectAll();
	}

}
