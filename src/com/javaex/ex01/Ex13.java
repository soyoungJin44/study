package com.javaex.ex01;

public class Ex13 {
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("----------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "진소영";
		
		System.out.println(str);
		System.out.println(str + name + str);
		System.out.println(i + i);
		System.out.println(i + d); //정수+실수 == 실수로 자동형변환됨
		System.out.println(str + i);
		
		String str2 = str + i;
		System.out.println(str + "랑" + name);
		
		System.out.println(str + " " + name);
		System.out.println("제이름은 " + name + "입니다.");
		
		System.out.println(c);
		System.out.println(c + c); //char은 더하면 문자열x 연산됨.
		
		//제 이름은 "진소영"입니다.
		System.out.println("제이름은 \"" + name + "\"입니다.");
		
		//제이름은 \진소영\ 입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다." );
		
		//제이름은       진소영 입니다 (tab 8칸 띄어쓰기
		System.out.println("제이름은\t" + name + "입니다.");
		
		//제이름은
		//진소영입니다.
		System.out.println("제이름은\n" + name + "입니다.");
	}

}
