package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Structure;

@Component
public interface StructureService {
	public List<Structure> selectAll();
}
