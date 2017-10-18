package com.easy.mapper;

import java.util.List;

import com.easy.model.Order;

public interface OrderMapper {
     public int         add(Order order);
     public int         delete(long orderId);
     public int         update(Order order);
     public int         updateState(long orderId);
     public int         updateStateToSucess(long orderId);
     public List<Order> selectAll();
     public  List<Order>      selectbyId(int userId);
     public  Order      selectbyorderId(int orderId);
     
}
