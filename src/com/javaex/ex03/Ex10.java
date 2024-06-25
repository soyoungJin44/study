package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		
		if(month <= 7 && month % 2 != 0 ) {
			System.out.println("31일 입니다.");
		}
		else if(month <= 6 && month != 2 && month % 2 == 0) {
			System.out.println("30일 입니다.");
		}
		else if(month == 2) {
			System.out.println("28일 입니다.");
		}
		else if(month >=8 && month % 2 != 0) {
			System.out.println("30일 입니다.");
		}
		else if(month >= 9 && month % 2 == 0) {
			System.out.println("31일 입니다.");
		}
		
		
		
		sc.close();
		
	}

	}
