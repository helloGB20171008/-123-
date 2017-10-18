package com.easy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.mapper.OrderMapper;
import com.easy.model.Order;
import com.easy.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
 @Autowired
 private OrderMapper orderMapper;
	@Override
	public int add(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.add(order);
	}

	@Override
	public int delete(long orderId) {
		// TODO Auto-generated method stub
		return orderMapper.delete(orderId);
	}

	@Override
	public int update(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.update(order);
	}

	@Override
	public List<Order> selectAll() {
		// TODO Auto-generated method stub
		return orderMapper.selectAll();
	}

	@Override
	public List<Order> selectbyId(int userId) {
		// TODO Auto-generated method stub
		return orderMapper.selectbyId(userId);
	}

	@Override
	public Order selectbyorderId(int orderId) {
		
		return orderMapper.selectbyorderId(orderId);
	}

	@Override
	public int updateState(int orderId) {
		// TODO Auto-generated method stub
		return orderMapper.updateState(orderId);
	}

	@Override
	public int updateStateToSucess(long orderId) {
		// TODO Auto-generated method stub
		return orderMapper.updateStateToSucess(orderId) ;
	}

}
