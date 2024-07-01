package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {

		int[] leftArry = new int[] {10,20,30};		//leftarry배열에 10,20,30 값 바로 대입	
		int[] rightArry = new int[] {10,20,30};		//rightarry배열에 10,20,30 값 바로 대입	
		
		if(leftArry.length == rightArry.length) {
			System.out.println("방의 갯수가 같습니다.");
			
			for(int i = 0; i <leftArry.length; i++) {		//두 배열의 방갯수가 같기때문에 for문에 들어옴
				if(!(leftArry[i] == rightArry[i])) {
					//System.out.println(i + "번째값이 같습니다.");	같은 값일때는 출력을 안하기 때문에
					System.out.println(i + "번째값이 다릅니다.");
				}/*else {
					System.out.println(i + "번째값이 다릅니다.");
				}*/
			}
		}else {
			System.out.println("방의 갯수가 다릅니다.");
		}
		
		
	}

}
