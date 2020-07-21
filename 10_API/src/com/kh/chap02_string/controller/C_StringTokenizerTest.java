package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		
		
		// 구분자를 이용하여 해당 문자열 분리 시키는 방법
		
		
		// 방법1. 분리된 문자열들을 배열로 차곡차곡 담아서 처리하고 싶을 때
		// 		 String 클래스에 제공하는 split 메소드 이용
		// 	  	 문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
	
		System.out.println("분리 후 문자열의 갯수  : " + arr.length);
		
		/*
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// 방법2. 분리된 각각의 문자열들을 객체로 취급하고 싶을 때
		// 		 StringTokenizer 클래스를 이용하는 방법
		//		StringTokenizer stn = new StringTokenizer(분리 시키고자하는 문자열, 구분자);
		
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		// str 문자를 분리해서 Token에 저장한다.
		
		// stn에 몇개의 Token이 있나요? --> countTokne(); 메소드를 사용한다!
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens());
		/*
		// stn 공간에서 Token을 빼오고 싶다면? --> nextToken(); 사용!
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		
		System.out.println("현재 남은 토큰 갯수 : " + stn.countTokens());
		*/
		
		/*
		int A = stn.countTokens(); //6
		
		for(int i = 0; i<A;i++) {
			
			System.out.println(stn.nextToken());

		}
		*/
		
		
		// hasMoreTokens --> 토큰이 남아있다면 true 토큰이 없다면 false
		
		while(stn.hasMoreTokens()) {
			
			System.out.println(stn.nextToken());
			
		}
		
		
		
	}
	
	
	
	
	public void method2() {
		
		String colors = "red/yellow#green blue,orange";
		
		System.out.println("split 방법 사용하기 ");
		
		//split방법
		String[] arr = colors.split("[/# ,]");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println("\nStringTokenizer 방법 사용하기 ");
		
		//StirngTokenizer 방법
		StringTokenizer stn = new StringTokenizer(colors,"/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		
		
		
		
		
		
		
	}
}
