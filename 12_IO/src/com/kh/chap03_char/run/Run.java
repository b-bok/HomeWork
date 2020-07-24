package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  *문자 기반 스트림 : 외부매체 선정후 2byte 단위로 데이터를 전송 가능한 통로를 통해 데이터 전송
		 *  
		 *  "문자 기반 스트림" : 2byte 단위로 데이터 전송 가능한 스트림
		 *  "기본(기반) 스트림" : 외부매체와 직접적으로 연결하는 통로 제공
		 * 
		 * 
		 *  XXXReader : XXX매체로부터 데이터 입력 통로
		 *  XXXWriter : XXX매체로 데이터 출력
		 *  
		 *  
		 */
		
		
		FileCharTest fc = new FileCharTest();
		
		fc.fileRead();
	}

}
