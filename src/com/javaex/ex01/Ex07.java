package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		//2024.06.19 5교시 <상수>  final
		
		double pi = 3.14;
		double result01 = pi * 5 * 5;
		System.out.println(result01);
		
		pi = 3.1415926;
		double result02 = pi * 5 * 5;
		System.out.println(result02);
		
		
		//////////////////////////////
		final double PI = 3.14;
		double result03 = PI * 5 * 5;
		System.out.println(result03);
		
		// PI = 3.14563;   //PI값을 고정시켜놨기때문에 오류남. 상수는 대문자로 내가 보기 편하게끔 표시만.
		
	}

}
