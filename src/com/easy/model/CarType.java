package com.easy.model;

public class CarType {//�ͺ�
 private int typeId;//�ͺű��
 private String typeName;//�ͺ�����
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
}
public String getTypeName() {
	return typeName;
}
public void setTypeName(String typeName) {
	this.typeName = typeName;
}
public CarType(int typeId, String typeName) {
	super();
	this.typeId = typeId;
	this.typeName = typeName;
}
public CarType(){}
@Override
public String toString() {
	return "CarType [TypeId=" + typeId + ", typeName=" + typeName + "]";
}

}
