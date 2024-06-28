package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		// 랜덤하세 숫자 6개를 입력받고 그 값들을 각기 다른 변수에 넣는법
		// 변수명은 일렬번호를 사용 할 수 없다. >> 배열을 사용해야한다.

		for (int i = 1; i <= 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			int[] nums = new int[6];

			for (int a = 0; a <= 6; a++) {

				nums[0] = num;
				nums[1] = num;
				nums[2] = num;
				nums[3] = num;
				nums[4] = num;
				nums[5] = num;

				System.out.println(nums[0]);

				// int num1 , unm2 , num3 , num4 , num5, num6;

				// for(int i = 1; i <=6; i++) {
				// System.out.println((int)(Math.random()*45)+1);

				// num1 = (int)(Math.random()*45)+1;

			}

		}

	}
}
