package com.easy.model;

public class GearBox {//������
	private int gearId;//��������
	private String gearName;//����������
	public int getGearId() {
		return gearId;
	}
	public void setGearId(int gearId) {
		this.gearId = gearId;
	}
	public String getGearName() {
		return gearName;
	}
	public void setGearName(String gearName) {
		this.gearName = gearName;
	}
	@Override
	public String toString() {
		return "GearBox [gearId=" + gearId + ", gearName=" + gearName + "]";
	}
	
	
}
