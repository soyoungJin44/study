package com.javaex.ex01;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		//문자열 받고 숫자열 받으면 ㄱㅊ. 숫자열 받고 문자열 받으면 버그남. 또는 sc.nextLine(); 입력해주면됨.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요:");
		
		int num = sc.nextInt();
	
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		sc.nextLine();
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		sc.close();
		
	}

}
