package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	
	// 프로그램 (자바 코드)  --> 외부매체(파일) (출력) (출력 : 프로그램 내의 데이터를 파일로 내보내기, 파일에 저장한다!)
	
	public void fileSave() {
		// FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		
		FileOutputStream fos = null;
		
		
		try {
			// 1. FileOutputStream 객체 생성 : 해당 파일과연결로 만들어짐
			fos = new FileOutputStream("a_byte.txt"); // 파일 없으면 자동 생성, 이미 있다면 바로 연결
			// true 작성시  --> 기존에 해당 파일 있을 경우 연이어 작성
			// true alwkrtldtl --> 기존에 해당파일에 덮어쓰기(기본값 false)
			
			
			
			
			
			// 2. 통로로 데이터 출력 : write() 메소드 사용
			//	    단, 1바이트 단위로 밖에 데이터 출력 불가
			fos.write(97);	// 숫자값 그대로 저장되는 것 아님, 해당 숫자의 아스키 코드(0~127)값 문자 발생
			fos.write('b');
			//fos.write('ㄱ'); // 한글은 2byte짜리이기 때문에 1byte 통로로 전달시 깨져서 기록됨!!

			
			// 바이트 배열도 출력 가능
			byte[] bArr = {99,100,101};	//cde

				fos.write(bArr);
				
				//fos.write(배열, 시작인덱스, 갯수) ==> 배열의 시작인덱스부터 갯수만큼 출력
				fos.write(bArr,1,2);	// de
			
			// 3. 스트림 다 이용 후 반납(close메소드 이용)	
		
			
				
			
		} catch(FileNotFoundException e) { //존재하지 않는 경로에 파일을 제시할 때 예외 발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 어떤 예외가 발생 하든 간에 반드시 실행할 구문 기술
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	// 프로그램(자바 코드) <-- 파일(입력 : 파일에 기록된 데이터 가져오기)
	public void fileRead() {
		
		//FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력 받는 스트림
		
		
		//1. FileInputStream 객체 생성 : 해당 파일 연결 통로 만듬
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			//2. 파일로부터 데이터를 입력하고자 할 때 read() 메소드 사용
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read()); // -1 파일의 끝
			System.out.println(fis.read()); // -1 파일의 끝
			*  
			*/
			
			// 계속 읽다가 파일의 끝을 보면 -1을 반환하는 걸 파악
			 
			/* 조건 검사시 읽어온 값을 출력해야하지만 실질적으로 출력하는것은 다시 읽어온 값
			 * 
			while((1)(3)(5)fis.read() != -1) { // 읽어온 값이 -1 아닐 경우만 출력 되게끔
				
				(2)(4)(6)System.out.println(fis.read());
			}
			*/
			
			//fis.read()는 반복문이 수행될때 마다 딱 한번만 실행되어야한다!
			
			// 해결방법1. 무한반복으로 돌리면서 조건검사
			
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.print(value + " ");
				}else {
					break;
				}
			}
			*/
			
			// 해결방법2. 권장방법
			int value = 0; // 매번 입력 받아올 데이터 기록할 변수 만들어두기
			
			while((value = fis.read()) != -1) {
				
				System.out.print((char)value + " ");
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
}
