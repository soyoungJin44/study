package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		// 랜덤하세 숫자 6개를 입력받고 그 값들을 각기 다른 변수에 넣는법
		// 변수명은 일렬번호를 사용 할 수 없다. >> 배열을 사용해야한다.
		
		int[] nums = new int[6];
		
		for (int i = 1; i <= 7; i++) {
			int num = (int) (Math.random() * 45) + 1;
			

			
				nums[0] = num;
			
 
				System.out.println(nums[i]);
				// >>이렇게 짜면 오류남

				// int num1 , unm2 , num3 , num4 , num5, num6;

				// for(int i = 1; i <=6; i++) {
				// System.out.println((int)(Math.random()*45)+1);

				// num1 = (int)(Math.random()*45)+1;

			}

	
	}
}
		/*
		int[] nums = new int[4];
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		
		System.out.println("------------------------");
		System.out.println(nums.length);
		System.out.println("------------------------");
*/
	

