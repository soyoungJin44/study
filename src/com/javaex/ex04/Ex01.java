package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

		//*6개씩 6줄 출력
		/*
		String s = "******";
		int i = 1;
		
		while(i <= 6) {
			System.out.println(s);
			i++;
		}
		*/
		
		for(int i = 1; i <=6; i++) {
			for(int n = 1; n <= 6; n++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
