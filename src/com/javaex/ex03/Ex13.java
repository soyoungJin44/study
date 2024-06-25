package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요: ");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			day = 30;
			break;
			
		case 2 :
			day = 28;
			break;
			
		default : 
			day = 31;
			break;
		}
		System.out.println(day + "일 입니다.");
		
		sc.close();
	}

}
