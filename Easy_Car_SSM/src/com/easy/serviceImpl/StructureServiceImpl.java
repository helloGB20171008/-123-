package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.StructureMapper;
import com.easy.model.Structure;
import com.easy.service.StructureService;
@Service
public class StructureServiceImpl implements StructureService{

	@Autowired 
	private StructureMapper structureMapper;
	public List<Structure> selectAll() {
		
		return structureMapper.selectAll();
	}

}
