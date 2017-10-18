package com.easy.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.easy.model.Order;
@Component
public interface OrderService {
	     public int                  add(Order order);
	     public int               delete(long orderId);
	     public int               update(Order order);
	     public int               updateState( int orderId);
	     public int               updateStateToSucess( long orderId);
	     public List<Order>       selectAll();
	     public  List<Order>      selectbyId(int userId);//一个电话多个订单
	     public  Order            selectbyorderId(int orderId);//一个订单号一个订单
	     

}
