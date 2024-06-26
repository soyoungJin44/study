package com.javaex.ex03;

public class Ex16 {

	public static void main(String[] args) {

		//1부터 10까지의 합을 구하는 프로그램을 만드세요.
	
		/*
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}


 for문 => 횟수정해두고 돌릴때 사용
 while문은 내가 원하는값이 나올때 종료될수있게끔 사용할때 사용함.
 
 
 */
		int sum = 0;
		
		for(int i = 0; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합은: " + sum);
	}
}
		
		
		