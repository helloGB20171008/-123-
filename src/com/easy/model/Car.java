package com.easy.model;

public class Car {
//车模型
	private int carId;//车编号
	private  int brandId;//品牌编号
	private int levelId;//级别编号
	private int typeId;//型号编号
	private int strId;//结构编号
	private int outId;//排量编号
	private  int gearId;//变速箱编号
	private int seat;//乘坐人数
	private  double original;//原价
	private double discount;//折扣
	private String image;//图片
	
	public  Car(){}
	
	public Car(int carId, int brandId, int levelId, int typeId, int strId,
			int outId, int gearId, int seat, double original, double discount,
			String image) {
		super();
		this.carId = carId;
		this.brandId = brandId;
		this.levelId = levelId;
		this.typeId = typeId;
		this.strId = strId;
		this.outId = outId;
		this.gearId = gearId;
		this.seat = seat;
		this.original = original;
		this.discount = discount;
		this.image = image;
	}

	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getStrId() {
		return strId;
	}
	public void setStrId(int strId) {
		this.strId = strId;
	}
	public int getOutId() {
		return outId;
	}
	public void setOutId(int outId) {
		this.outId = outId;
	}
	public int getGearId() {
		return gearId;
	}
	public void setGearId(int gearId) {
		this.gearId = gearId;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public double getOriginal() {
		return original;
	}
	public void setOriginal(double original) {
		this.original = original;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brandId=" + brandId + ", levelId="
				+ levelId + ", typeId=" + typeId + ", strId=" + strId
				+ ", outId=" + outId + ", gearId=" + gearId + ", seat=" + seat
				+ ", original=" + original + ", discount=" + discount
				+ ", image=" + image + "]";
	}
	
}
