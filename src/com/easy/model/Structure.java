package com.easy.model;

public class Structure {//结构
	private int strId;//结构编号
	private String  strName;//结构名称
	/*异常：无法转换为内部表示
	 * 原因：字符类型写错*/
	public int getStrId() {
		return strId;
	}
	public void setStrId(int strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public Structure(int strId, String strName) {
		super();
		this.strId = strId;
		this.strName = strName;
	}
	public Structure(){}
	@Override
	public String toString() {
		return "Structure [strId=" + strId + ", strName=" + strName + "]";
	}
	
}
