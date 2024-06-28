package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int no;
		
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		/*
		while(true) {
			
			no = sc.nextInt();
			
			if(no == 0) {
				break;
			}
			sum = sum + no;
			System.out.println("합계: " + sum);
			
			
		}
		System.out.println("종료");
		*/
		
		do {
			no = sc.nextInt();
			sum = sum + no;
			System.out.println("합계: " + sum);
			
		}while(no != 0);
		System.out.println("종료");
	}



}
