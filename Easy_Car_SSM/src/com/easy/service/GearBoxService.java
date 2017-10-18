package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.GearBox;

@Component
public interface GearBoxService {
	public List<GearBox> selectAll();
}
