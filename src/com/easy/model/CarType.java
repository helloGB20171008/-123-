package com.easy.model;

public class CarType {//型号
 private int typeId;//型号编号
 private String typeName;//型号名称
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
