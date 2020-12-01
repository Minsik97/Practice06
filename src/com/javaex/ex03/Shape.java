package com.javaex.ex03;

public class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {
	}
	
	public Shape(String fillColor, String lienColor) {
		this.fillColor = fillColor;
		this.lineColor = lienColor;
	}


	//메소드 g/s
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLienColor(String lienColor) {
		this.lineColor = lienColor;
	}
	
}

