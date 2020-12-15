package com.javaex.ex05;

import java.util.ArrayList;

public class ShapeApp {

    public static void main(String[] args) {
      
    	//값을 담아줄 배열을 만듬
    	ArrayList<Shape> tList = new ArrayList<Shape>();
    	//
    	Shape rect = new Rectangle(5.0, 6.0);
    	Shape rTri = new RectTriangle(6.0, 2.0);
    	
    	tList.add(rect);
    	tList.add(rTri);
    	
    	for(int i=0; i<tList.size(); i++) {
    		System.out.println("area: " + tList.get(i).getArea());
    		System.out.println("perimeter: " + tList.get(i).getPerimeter());
    		if(tList.get(i) instanceof Resizeable) {	//객체 instanceof 클라쓰
    			((Rectangle)tList.get(i)).resize(0.5);
    			System.out.println("new area: " + tList.get(i).getArea());
    			System.out.println("new perimeter: " + tList.get(i).getPerimeter());
    		}
    	}
    }
}
