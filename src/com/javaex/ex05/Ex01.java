package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 
		 // 랜덤으로 숫자 6개 출력
		for(int i = 1; i <= 6; i++) {
			System.out.print((int)(Math.random() * 45)+1);
			System.out.print("	");
			
		}
		*/
		
		/* 랜덤수를 받아서 rotto라는 변수에 초기화시키기
		int rotto = (int)(Math.random()*45)+1;
		System.out.println(rotto);
		*/
		
		// 랜덤으로 뽑은 <같은수 6개> 출력
		int rotto = (int)(Math.random()*45)+1;
		
		for(int i = 1; i <=6; i++) {
			System.out.println(rotto);
		}
	}

}
