package com.javaex.ex05;

public class Rectangle extends Shape implements Resizeable {
    
	//Shape 상속자 interface
	
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	};
	
	//메소드 g/s - 생략
	
	//메소드 일반
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}
	
}