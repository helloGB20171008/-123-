package com.easy.model;

public class User {
	private int userTe;//用户编号
	private String userName;//用户账户
	private String  userPw;//用户密码
	private int  userType;//用户类型 
	public int getUserTe() {
		return userTe;
	}
	public void setUserTe(int userTe) {
		this.userTe = userTe;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public User(int userTe, String userName, String userPw, int userType) {
		super();
		this.userTe = userTe;
		this.userName = userName;
		this.userPw = userPw;
		this.userType = userType;
	}
	public User(){}
	@Override
	public String toString() {
		return "User [userTe=" + userTe + ", userName=" + userName
				+ ", userPw=" + userPw + ", userType=" + userType + "]";
	}
	
	
}
