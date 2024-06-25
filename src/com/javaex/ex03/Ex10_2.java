package com.javaex.ex03;

import java.util.Scanner;

public class Ex10_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요: ");
		int month = sc.nextInt();
		int day = 0;
		
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}else if(month == 2) {
			day = 28;
		}else {
			day = 31;
		}
		
		System.out.println(day + "일 입니다.");
		
		sc.close();
	}
}
