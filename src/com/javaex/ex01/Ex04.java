package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		double num1 = 3.21445;
		double num2 = 2.135;
		
		System.out.println(num1);
		System.out.println(num2);
	
		float var01 = 1.2F;
		float var02 = 3.246F;
	
		System.out.println(var01);
		System.out.println(var02);
		
		
		//double 형의 실수 계산시 길면 짤림. ㄱㅊ 일할때 지장없음 
		//예시
		double num3 = 2.336435476543;
		double num4 = 3.354643438473435487;
		double result = num3 + num4;
		
		System.out.println(result);
		
		double num5 = 1.21354343211543543545;
		float num6 = 1.213545343543435F;
		
		System.out.println(num5);
		System.out.println(num6);
		
		
		//앞자리 길게잡으면 앞자리는 안짤릴까?
		double var03 = 123456789.1234;   //E8로 표현됨. 뒷자리가 길면 짤리겠다만 짧게 잡아서 안잘림
		float var04 = 123456789.12F;     //더 많이 잘림~~ 앞자리도 잘림 ㅎㅎ
		
		System.out.println(var03);
		System.out.println(var04);
		
	}
 
}
