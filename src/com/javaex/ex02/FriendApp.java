package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	
    	ArrayList<Friend> fr = new ArrayList<Friend>();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");


    	for(int i=0; i<3; i++) {
        	String frInfo = sc.nextLine();
    		String[] data = frInfo.split(" ");
    		
    		Friend friend = new Friend(data[0], data[1], data[2]);
    		fr.add(friend);
    	}
    	
    	for(int i=0; i<fr.size(); i++) {
    		fr.get(i).showInfo();
    	}
    	
    	sc.close();
    }

}
