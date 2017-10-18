package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.OutPutMapper;
import com.easy.model.OutPut;
import com.easy.service.OutPutSevice;
@Service
public class OutPutSeviceImpl  implements OutPutSevice{

	@Autowired
	private OutPutMapper outPutMapper;
	public List<OutPut> selectAll() {
		// TODO Auto-generated method stub
		return outPutMapper.selectAll();
	}

}
