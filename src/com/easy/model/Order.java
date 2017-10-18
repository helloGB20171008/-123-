package com.easy.model;

public class Order {
     private  long  orderId;
     private  String getCarTime;
     private  String returnCarTime;
     private  String getCarPlace;
     private  String returnCarPlace;
     private  double orderPrice;
     private  int    orderState;
     private  int    userId;
     private  int    carId;
     
     
     public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getGetCarTime() {
		return getCarTime;
	}
	public void setGetCarTime(String getCarTime) {
		this.getCarTime = getCarTime;
	}
	public String getReturnCarTime() {
		return returnCarTime;
	}
	public void setReturnCarTime(String returnCarTime) {
		this.returnCarTime = returnCarTime;
	}
	public String getGetCarPlace() {
		return getCarPlace;
	}
	public void setGetCarPlace(String getCarPlace) {
		this.getCarPlace = getCarPlace;
	}
	public String getReturnCarPlace() {
		return returnCarPlace;
	}
	public void setReturnCarPlace(String returnCarPlace) {
		this.returnCarPlace = returnCarPlace;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Order(long orderId, String getCarTime, String returnCarTime,
			String getCarPlace, String returnCarPlace, int orderState,
			double orderPrice, int userId, int carId) {
		this.orderId = orderId;
		this.getCarTime = getCarTime;
		this.returnCarTime = returnCarTime;
		this.getCarPlace = getCarPlace;
		this.returnCarPlace = returnCarPlace;
		this.orderState = orderState;
		this.orderPrice = orderPrice;
		this.userId = userId;
		this.carId = carId;
	}
	public Order(){}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", getCarTime=" + getCarTime
				+ ", returnCarTime=" + returnCarTime + ", getCarPlace="
				+ getCarPlace + ", returnCarPlace=" + returnCarPlace
				+ ", orderState=" + orderState + ", orderPrice=" + orderPrice
				+ ", userId=" + userId + ", carId=" + carId + "]";
	}
	
	
     
}
