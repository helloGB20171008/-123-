package com.easy.model;

public class OutPut {//排量
	private int outId;//排量编号
	private String outName;//排量名称
	public int getOutId() {
		return outId;
	}
	public void setOutId(int outId) {
		this.outId = outId;
	}
	public String getOutName() {
		return outName;
	}
	public void setOutName(String outName) {
		this.outName = outName;
	}
	public OutPut(int outId, String outName) {
		super();
		this.outId = outId;
		this.outName = outName;
	}
	public OutPut(){}
	@Override
	public String toString() {
		return "OutPut [outId=" + outId + ", outName=" + outName + "]";
	}
}
