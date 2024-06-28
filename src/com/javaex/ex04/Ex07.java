package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		/*
		int i = 1;
		
		while(true) {
			
			if(i > 3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		*/
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			
			if(i > 3) {
				flag = false; // ==break;
			}
			System.out.println(i);
			i++;
			//if문이 false가 되어서 i++된게 마지막으로 출력되고(while문내에서 도는거)끝남
			//break;를 걸게되면 아예 while문 자체를 빠져나온다.
		}
	}

}
