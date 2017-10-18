package com.easy.model;

public class Levels {//级别
  private int levelId;//级别编号
  private String  levelName;//级别名称
public int getLevelId() {
	return levelId;
}
public void setLevelId(int levelId) {
	this.levelId = levelId;
}
public String getLevelName() {
	return levelName;
}
public void setLevelName(String levelName) {
	this.levelName = levelName;
}
@Override
public String toString() {
	return "Levels [levelId=" + levelId + ", levelName=" + levelName + "]";
}
public Levels(int levelId, String levelName) {
	super();
	this.levelId = levelId;
	this.levelName = levelName;
}
public Levels(){}
}
