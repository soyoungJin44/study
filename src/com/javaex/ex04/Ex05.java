package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {

		for(int num = 1; num <= 20; num++) {
			
			if(num % 2 == 0 || num % 3 == 0) {
				continue;
			}
			System.out.println(num);
		}
		
	}

}
