package com.javaex.ex05;

public class Depart extends Employee {
	// 필드
	private String Depart;

	// 생성자
	public Depart() {
	}

	public Depart(String depart, int salary, String name) {
		super(name, salary);
		Depart = depart;
	}

	// 메소드 g/s
	public String getDepart() {
		return Depart;
	}

	public void setDepart(String depart) {
		Depart = depart;
	}
	
	//메소드 일반
	public void showInformation() {
		System.out.println("이름:" + getName() + "    연봉:" + getSalary() + "    부서:" + Depart);
	}

}
