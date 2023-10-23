package edu.ch06;

public class Armor {
	private String name;
	private int height;
	
	// 값을 불러오고 싶을 때
	public String getName() {
		return name;
	}
	// 값을 넣어주고 싶을 때, 설정할 때
	// this. 자신의 클래스 안
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
