package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// 배열 <복사> 부분 >> 값을 넣은 후 따로 관리 // 각각 공간 따로 존재함.

		// arrA 배열 선언
		int[] arrA = new int[3];

		// arrA배열에 값대입
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;

		// arrB 배열 선언
		int[] arrB = new int[3];

		// arrB 배열에 << arrA 배열의 값 넣음
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i]; // >> 따로 만들어진 공간에 값 복사하는 표현
		}
		System.out.println("arrA[]");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("i= " + arrA[i]);
		}
		System.out.println("arrB[]");
		for (int i = 0; i < arrB.length; i++){
			System.out.println("i= " + arrB[i]);
		}
		

	}

}
