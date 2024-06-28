package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {

		int[]nums = new int[3];
		
		nums[0] = 3;
		nums[1] = 10;
		nums[2] = 27;
		
		for(int i =0; i<nums.length;i++) { // nums.length = 공간최대값까지 = 3까지
			System.out.println(nums[i]);
		}
		System.out.println("=====================");
		
		nums[0] = 13;
		for(int i = 0; i< nums.length; i++) { //없는공간까지 출력을 하면, 출력 후 오류남.
			System.out.println(nums[i]);
		}
		
		
	}

}
