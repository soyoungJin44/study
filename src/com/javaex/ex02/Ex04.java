package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요.");
		System.out.print("키: ");
		
		double cm = sc.nextDouble();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + cm + " 입니다.");
		
		System.out.println("거주지를 입력해주세요.");
		System.out.print("거주지: ");
		
		sc.nextLine();
		String area = sc.nextLine();
		
		System.out.println("당신의 거주지는 " + area + "입니다.");
		
		sc.close();
	}

}
