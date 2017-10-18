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
	     public  List<Order>      selectbyId(int userId);//һ���绰�������
	     public  Order            selectbyorderId(int orderId);//һ��������һ������
	     

}
