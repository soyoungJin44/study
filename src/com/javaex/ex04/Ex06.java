package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {

		for(int a = 1; a <= 10; a++) {
		
			if(a%2 == 0 && a%3 == 0) {
				continue;
				
			}System.out.println(a);
		}
		System.out.println("------------------");
		
		for(int i = 1; i <=10; i++) {
			
			if(i%2==0 && i%3==0) {
				
			}else {
				System.out.println(i);
			}
			
			
		}
		
	}

}
