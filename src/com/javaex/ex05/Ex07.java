package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		//배열 복사 (주소값 복사) 
		
		//arrA 배열 선언
		int[] arrA = new int[3];
		
		//arrA 에 값대입
		arrA[0] = 3;
		arrA[1] = 6;   //아파트 호실로 표현
		arrA[2] = 9;
		
		int[] arrB; //arrB라는 아파트의 주소 개념이라고 이해(공간은 따로 만들어지지 않았음)
		
		//arrB 주소에 << arrA 값을 대입
		arrB = arrA;
		
		//배열 arrA 출력
		System.out.println("arrA");
			for(int i = 0; i < arrA.length; i++) {
				System.out.println("i= " + arrA[i]);
			}
		System.out.println("=====================");
			
		System.out.println("arrB");
			for(int i =0; i<arrB.length; i++) {
				System.out.println("i= " + arrB[i]);
			}
		
		
	}

}
