package com.kh.chap03_wrapper.controller;

import java.sql.Wrapper;

public class WrapperTest {

	/*
	 * * Wrapper 클래스
	 * --> 기본자료형을 객체로 포장해주는 클래스가 래퍼클래스(Wrapper 클래스)이다.
	 * 
	 * 
	 * 		기본자료형		Wrapper클래스
	 * 		boolean <--> Boolean
	 * 		 char	<--> Character
	 *		 byte	<--> Byte
	 *		short	<--> Short
	 *		 int	<--> Integer
	 *		 long	<--> Long
	 *		 float	<--> Float
	 *		 double <--> Double
	 * 
	 * 	- 기본 자료형으로 사용을 해도 되지만 프로그램에 따라 해당 기본자료형을 객체로 취급해야되는 경우가 있음
	 * 		ex) 메소드 호출해야될때
	 * 			메소드의 매개변수로 기본자료형이 아닌 객체 타입을 요구될 때
	 * 			다형성을 적용시키기고 싶을 때

	 */
	
	public void method1() {
		
		//Boxing : 기본자료형 --> Wrapper클래스 자료형
		
		int num1 = 10;
		int num2 = 15;
		
		// 1. 객체 생성을 통한 방법
		Integer i1 = new Integer(num1);		// num1 --> i1
		Integer i2 = new Integer(num2);		// num2 --> i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		// 객체로 바꾸게 되면 메소드를 이용가능
		System.out.println(i1 == i2);		//false
		System.out.println(i1.equals(i2));	//false
		System.out.println(i1.compareTo(i2)); // 두값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0 반환 
		
		// 2. 객체 생성 하지 않고, 바로 대입(AutoBoxing)
		
		Integer i3 = num2;	// num2 --> i3
		
		System.out.println(i3);
		
		// 언제 객체생성을 통해서 변환? --> 문자열을 Integer 타입으로
		//Integer i4 = "123" 은 안돼!
		Integer i4 = new Integer("123"); // "123" --> 123
		System.out.println(i4);
		
		
		// UnBoxing : Wrapper 클래스자료형 --> 기본자료형
		
		// 1. 해당 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해
		
		// i1 --> num3
		int num3 = i1.intValue();	//10
		int num4 = i2.intValue();	//15
		
		System.out.println(num3);
		System.out.println(num4);
		
		// 2. 메소드따위 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		
		int num5 = i1; // 10
	
	}
	
	public void method2() {
		
		// 기본자료형 <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		
		
		System.out.println(str1 + str2); //문자열로 작업
		
		//1. String --> 기본자료형		: 파싱한다! --> 진짜 많이 사용한다!
		//   "10"	--> 10
		//	 "15.3"	--> 15.3	
		
		// 해당Wrapper클래스.parseXXX() 사용
		
		int i = Integer.parseInt(str1);	// 10
		double d = Double.parseDouble(str2); //15.3
		
		System.out.println(i + d);
		
		//2. 기본자료형 --> String 
		//		10 	--> "10"
		// 	   15.3 --> "15.3"
		
		// 기본자료형 --> Wrapper객체 --> String
		// strI = Integer.valueOf(i).toString();	// "10"
		//String strD = Double.valueOf(d).toString();		// "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println(i + d);
	}
	
	
	
}
