package com.javaex.ex03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			int result = dan * i;
			
			System.out.println(dan + " * " + i + " = " + result);
		}
		sc.close();
	}

}
