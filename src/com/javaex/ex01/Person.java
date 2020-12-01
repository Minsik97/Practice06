package com.javaex.ex01;

public class Person {
	
	
	//필드
	protected String name;
	protected String hp;

	//생성자
	public Person() {
	}
	
	public Person(String name, String num) {
		this.name = name;
		this.hp = num;
	}
	
	//메소드 g/s
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return hp;
	}
	public void setNum(String num) {
		this.hp = num;
	}
	
	public void showInfo() {
		System.out.println("#이름:" + name + ", " + "#핸드폰:" + hp);
	}
	
	
}
