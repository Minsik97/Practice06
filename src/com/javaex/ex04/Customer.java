package com.javaex.ex04;

public class Customer extends User {
	//필드
	protected int point;

	//생성자
	public Customer() {

	}

	public Customer(String id, String psw, String name, int point) {
		super(id, psw, name);
		this.point = point;
	}

	//메소드g/s
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름:" + name + ", 포인트:" + point);
	}

}
