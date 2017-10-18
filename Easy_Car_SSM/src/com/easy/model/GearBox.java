package com.easy.model;

public class GearBox {//变速箱
	private int gearId;//变速箱编号
	private String gearName;//变速箱名称
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
