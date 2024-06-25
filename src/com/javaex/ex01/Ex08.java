package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		//2024.06.19 6교시 <자동형변환>
		//  *** int < long < double 
		
		int num1 = 1;
		int num2 = 2;
		int result1 = num1 + num2;
		
		System.out.println(result1);
		
		int num3 = 1;
		double num4 = 1.0;
		double result2 = num3 + num4;
		System.out.println(result2);
		
		
		char a = '^';
		int b = 2;
		int result = a + b;
		System.out.println(result);
		
		// <강제형변환>
		
		double var1 = 13.689;
		int var2 = (int)var1;
		System.out.println(var1);
		System.out.println(var2);
		
		int numb1 = 2;
		double numb2 = (double)numb1;
		System.out.println(numb2);
		
		
	}

}
