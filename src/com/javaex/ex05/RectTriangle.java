package com.javaex.ex05;

public class RectTriangle extends Shape {
	
	//Shape의 속성자임으로 메소드 생성
    
	//필드
	private double width;
	private double height;
	
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	

	//메소드
	
	public double getArea() {
		return width*height*0.5;
	}
	
	public double getPerimeter() {
		return width+height+Math.sqrt(width*height+width*height);
	}
}