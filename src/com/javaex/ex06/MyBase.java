package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	public void service(String Base) {

		if (Base.equals("오후")) {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		} else if (Base.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자");
		} else if (Base.equals("밤")) {
			System.out.println("밤에는 숙면");
		}
	}

}
