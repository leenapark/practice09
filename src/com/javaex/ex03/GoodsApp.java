package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		ArrayList<Goods> gList = new ArrayList<Goods>();
		System.out.println("상품을 입력해주세요(종료 q)");
		Scanner sc = new Scanner(System.in);
		int sum=0;

		while (true) {
			String goods = sc.nextLine();
			if ("q".equals(goods)) {
				break;
			}
			String[] data = goods.split(",");

			Goods goodsInfo = new Goods(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));

			gList.add(goodsInfo);
			sum = sum + Integer.parseInt(data[2]);
		}
		
		System.out.println("[입력 완료]");
		System.out.println("===========================");
		
		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
		}
		
		System.out.println("모든 상품의 갯수는 " + sum + " 입니다.");

		sc.close();
	}

}
