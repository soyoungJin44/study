package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		int[] nums = new int[6];
		
			for(int i = 0; i <nums.length; i++) {
				
				nums[i] = (int)(Math.random() * 45)+1;
				
				System.out.print(nums[i]);
				System.out.print("  ");
				
		}
			System.out.println("");
			System.out.println(nums[0]);
		
		
		
		
	}

}
