package com.kh.chap02_byte.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	
	// 프로그램 (자바 코드)  --> 외부매체(파일) (출력)
	
	public void fileSave() {
		// FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트럼
		
		
		try {
			// 1. FilOutputStrea 객체 생성 : 해당 파일과연결로 만들어짐
			FileOutputStream fos = new FileOutputStream("a_byte.txt");
			
			// 2. 통로로 데이터 출력 : write() 메소드 사용
			//	    단, 1바이트 단위로 밖에 데이터 출력 불가
			fos.write(97);	// 숫자값 그대로 저장되는 것 아님, 해당 숫자의 아스키 코드
			fos.write('b');
			fos.write('ㄱ'); // 한글은 2byte짜리이기 때문에 1byte 통로로 전달시 깨져서 기록됨!!

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
