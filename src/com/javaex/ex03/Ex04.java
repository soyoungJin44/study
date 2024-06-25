package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		
		if(time <= 8) {
			int pay1 = time * 10000;
			System.out.println("임금은 " + pay1 + "입니다.");
		}
		else if(time > 8) {
			int pay2 = time * 12000;
			System.out.println("임금은 " + pay2 + "입니다.");
		} //이 코드는 틀렸음. 9시간일시 초과근무 외에도 기존 8시간에도 12000원으로 계산됨.
		
		sc.close();
		
		/*
		**if문 들어가기전에 int pay 를 선언해두면 보기가 더편함.
		 
		 int pay;
		 
		 if(time <= 8){
		     pay = time * 10000;
		     
		 else{
		     pay = 8 * 10000 + (time - 8) * 12000;
		     
		     }
		     System.out.println("월급은" + pay + "입니다.")
		     
		     **수정할때도 한두곳만 변경하면 될수있도록, 최대한 간결하게 짜기.
		 */
		
	}

}
