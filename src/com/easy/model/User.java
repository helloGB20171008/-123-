package com.easy.model;

public class User {
	private int userTe;//�û����
	private String userName;//�û��˻�
	private String  userPw;//�û�����
	private int  userType;//�û����� 
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
