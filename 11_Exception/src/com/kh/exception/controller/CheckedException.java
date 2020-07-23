package com.kh.exception.controller;

import java.io.*;


public class CheckedException {

	// CheckedException : 반드시 예외처리를 해줘야하는 예외들!
	//					    예측 불가능한 상황에서 예외 발생 ==> 미리 예외가 "발생"했을 때 대비하여 "처리"하는 구문 기술
	
	// 보통 외부매게체와 어떤 입출력이 발생할 때 Exception 발생!!
	
	public void method1() throws IOException  {
		/*
		try {
			
			method2();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		method2();
		
	}
	
	public void method2() throws IOException {
	
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 기록 가능)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무거나 입력해라! : ");
		
		/*
		try {
			
			String str = br.readLine();
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 예외처리방법2. throws : 지금 당장 여기서 예외처리하지 않고 메소드 호출한 곳으로 떠넘김ㅋ
		String str = br.readLine();
		System.out.println(str);
		
	}
	
	//						|	예외발생시점		|	예외처리			
	// ==============================================================
	// RuntimeException 	| 런타임 에러(프로그램 실행)| 	세모(개발자케바케)	--> UnCheckedException
	// RuntimeException 외 	|	컴파일 에러(빨간줄)	| 		필수			--> CheckedException
	
	
	
}
