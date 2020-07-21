package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	
	public void method1() {
		
		/*
		 * * String 클래스
		 * - 불변 클래스(변하지 않는 클래스)
		 * 		--> 수정하는 순간 그자리에서 변경 되지 않음
		 */
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2); // flase(주소값 다름)
		
		System.out.println(str1);
		System.out.println(str2);
		//toString() -->String 클래스에 이미 오버라이딩 되어있음
		
		System.out.println(str1.equals(str2)); // true(실제담긴 문자열간 비교)
		// equals()  --> String 클래스에 이미 오버라이딩 되어있음(실제 담긴 문자열간 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() -->String 클래스에 이미 오버라이딩 되어있음(실제 담긴 문자열로 주소를 만들어서 동일함)
		
		
		// 만약에 정말 정말 주소값을 알고 싶다면 System.identityHashCode(레퍼런스) 이용	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	public void method2() {
		
		//	2. 문자열을 리터럴로 생성
		String str1 = "hello";
		String str2 = "hello";
		// 리터럴 제시시 StringPool 영역에 올라감
		// String Pool 특징: 동일한 문자열 존재 불가
		
		
		String str3 = new String("hello");
		
		System.out.println(str1 == str2); // true (주소값 일치)
		// stack heap static 영역에서
		// heap 영역에는 StringPool이 존재
		// 문자열 리터럴은 StringPool로 들어감
		// 상수풀은 동일한 문자열이 생성되지 않는다!
		// 만약 str1과 str2가 같은 곳을 바라보고 있다고 볼 수 있다.
		// 기존에 있는 주소값을 str2역시 참조하는 것이다.
		// 리터럴이 아닌 객체 생성 구문의 경우 StringPool이 아닌 Heap영역에 할당 됨
		// 그래서 str2 != str3
		
		
		// StringPool에 같은 주소값을 참조하고 있으므로 진짜 주소값도 역시 동일
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		// 불변 클래스(변하지 않는 클래스 == 그자리에서 수정되는 개념 아님)
		
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		// 문자열 변경하는 순간 기존의 문자열자에서 변경되는 것이 아닌
		// 새로운 곳에 할당(새로운 주소값을 얻음 == 주소값 변경)
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		
		
		str2 = "eee";
		System.out.println(System.identityHashCode(str2));
				
		/*
		 * 
		 *  String 클래스 == 불변 클래스
		 *  --> 계속 값을 변경하는 경우 가비지컬랙터(GC)가 계속 지워줘야만 하는 단점 있음
		 *  
		 * 
		 * 
		 */
			
		str2 ="hello";
		System.out.println(System.identityHashCode(str2));
		
		
	}
}
