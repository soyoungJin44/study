package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		if(time <= 8) {
			int pay1 = time * 10000;
			System.out.println("임금은 " + pay1 + "입니다.");
		}
		else {
			double pay2 = time * (10000 * 1.5);
			System.out.println("임금은 " + (int)pay2 + "입니다.");
			
		}
		
		
		sc.close();
		
	}

}
