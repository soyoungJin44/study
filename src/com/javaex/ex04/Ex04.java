package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int num1 = sc.nextInt();
		
		if(num1 % 3 == 0 && num1 != 0 ) {
			System.out.println("3의 배수입니다.");
		}else if(num1 % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}else if(num1 == 0) {
			System.out.println("종료");
			break;
		}
		}
	sc.close();
	}
	
	// (num == 0) 을 제일 위로 올려주멵 >> (num1 % 3 == 0)의 식이 간단해진다.
	// 수식은 최소화하고, 간만하고 명료하게 쓰는것이 좋다.
}
