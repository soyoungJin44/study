package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	
	//Ex 13 으로 수정
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1 : 
			day = 31;
			break;
		case 2 : 
			day = 28;
			break;
		case 3 :
			day = 31;
			break;
		case 4 :
			day = 30;
			break;
		case 5 : 
			day = 31;
			break;
		case 6 :
			day = 30;
			break;
		case 7 :
			day = 31;
			break;
		case 8 :
			day = 31;
			break;
		case 9 :
			day = 30;
			break;
		case 10 :
			day = 31;
			break;
		case 11 :
			day = 30;
			break;
		case 12 :
			day = 31;
			break;
		}
		System.out.println(day + "일 입니다.");
				
	}

}
