package com.javaex.ex05;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//원래라면 String[] args = new String[3]으로 선언 후, args[0] = "나는"; 형식으로 선언을 해줬어야함.
		//이걸 javac 가 해주는중
		
		
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		
		/*
		if(args[0].equals("-version")){
		System.out.println("1.0");
		
		}else if(args[0].equals("-help")){
			System.out.println("도움말");
			
		}
		*/
	}
	
	
}

