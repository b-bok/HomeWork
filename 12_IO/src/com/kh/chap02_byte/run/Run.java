package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {

	// "바이트 기반 스트림" 가지고 데이터 입출력 할 것!!
		
	// "바이트 스트림" : 데이터를 1byte 밖에 전송 불가	
	// "기반 스트림" : 외부매체랑 직접적으로 연결되는 통로!!
	
	// "바이트 기반 스트림" --> 외부매체를 지정하고 외부매체와 직접적으로 연결된 통로에 데이터를 1byte 단위로 전송한다!
		
	// XXXInputStream  : XXX매체로부터 데이터를 입력 받는 통로
	// XXXOutputStream : XXX매체에 데이터를 출력하는 통로
	
	// File InputStream/ OutputStream : --> 외부 매체를 file로 하겠어!
	// Audio InputStrem/ OutputStream : --> 외부매체로 오디오 장치!
	// Piped InputStrem/ OutPutStream : --> 외부매체랑 또다른 프로그램 연결!
		
		FileByteTest fb = new FileByteTest();
		
		fb.fileRead();
		
		
		//System.out.println((int)'ㄱ');
		
	}

}
