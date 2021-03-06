package com.kh.chap01_math.run;

public class Run {

	public static void main(String[] args) {

	// java.lang --> 이미 import되어 있다!	
		
	// 상수필드	
		System.out.println("파이 : " + Math.PI);
		
	// 절대값을 알고자 할 때  : abs
		
		int num1 = -10;
		
		System.out.println("절대값 : " + Math.abs(num1));
		
	// 올림 : ceil
		
		double num2 = 4.349;
		
		System.out.println("올림 : " + (int)Math.ceil(num2));
			
	
	// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2*10)*0.1);
		
	// 버림 : floor
		System.out.println("버림 : " + Math.floor(num2));
		
	// 가장 가까운 정수갑 : rint
		
		System.out.println(num2 + "와 가장 가까운 정수값 : " + Math.rint(num2));
		
	// 제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4.8));
		
	// 제곱 : pow(수,제곱횟수);
		
	System.out.println("2의 10 제곱은? : " + Math.pow(2,5));
	}

	// Math 특징
	// 모든 필드 상수필드, 모든 메소드 static 메소드!!
	// 모든게 static
	// 생성자 모두 private --> 객체 생성할 필요없기 때문에
	
	
	// staic --> 프로그램 시작할 때 딱 한번 static 메모리영역에 올림!!
	// 			 Math 객체 생성 없이 클래스명. 으로 접근 가능
	// 한번만 메모리 영역에 올려놓고 재사용하는 개념 --> 싱글톤패턴
	
}
