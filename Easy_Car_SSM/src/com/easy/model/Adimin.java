package com.easy.model;

public class Adimin {//����Ա
private int adminNo;//����Ա���
private String adminUser;//����Ա�˻�
private String  adminPw;//����Ա����
private int  adminType;//����Ա���� 

public  Adimin(){
	
}
public Adimin(int adminNo, String adminUser, String adminPw, int adminType) {
	super();
	this.adminNo = adminNo;
	this.adminUser = adminUser;
	this.adminPw = adminPw;
	this.adminType = adminType;
}

public int getAdminNo() {
	return adminNo;
}
public void setAdminNo(int adminNo) {
	this.adminNo = adminNo;
}
public String getAdminUser() {
	return adminUser;
}
public void setAdminUser(String adminUser) {
	this.adminUser = adminUser;
}
public String getAdminPw() {
	return adminPw;
}
public void setAdminPw(String adminPw) {
	this.adminPw = adminPw;
}
public int getAdminType() {
	return adminType;
}
public void setAdminType(int adminType) {
	this.adminType = adminType;
}
@Override
public String toString() {
	return "Adimin [adminNo=" + adminNo + ", adminUser=" + adminUser
			+ ", adminPw=" + adminPw + ", adminType=" + adminType + "]";
}

}
