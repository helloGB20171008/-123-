package com.easy.model;

public class Structure {//�ṹ
	private int strId;//�ṹ���
	private String  strName;//�ṹ����
	/*�쳣���޷�ת��Ϊ�ڲ���ʾ
	 * ԭ���ַ�����д��*/
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
