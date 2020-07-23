package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {


	public static void main(String[] args) {

		// 파일 만들어지는것에 대한 간단 테스트
		// java.io 패키지에 있는 File 클래스 가지고 파일만 생성
		
		
		// 1. 경로지정 안한 파일 생성 --> 해당 이 프로젝트에 파일 생성

		try {
			File f1 = new File("texs.txt");
			f1.createNewFile();
			
			
			//2. 존재하는 기존 드라이버나 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			System.out.println("\t \n \"\" ");
			
			
			//3. 폴더 만들고 파일 생성
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); 	//make directory
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// .exists ==> 이 파일이 존재 합니까?
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			System.out.println("절대경로 : " + file.getAbsolutePath()); //물리적인 경로
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();	// 예외발생이 어디서 했는지 알려주는 메소드
		}
		
		System.out.println("종료!");
	
		System.out.println();
	}

	
	/*
	 * 
	 *  프로그램 상의 데이터를 외부 매체로 출력을 한다거나/ 또는 외부 매체로부터 입력을 받아 올때
	 *  반드시 그 외부매체와 직접적인 통로를 만들어야 한다! => 그게 바로 스트림
	 *  
	 *  * 스트림의 특징
	 *  - 단방향 : 입력과 출력을 동시해 할 수 없음(입 출력을 위해서 따로 스트림을 만들어야함)
	 *  - 선입선출 : 먼저 보낸값이 먼저 나감(시간 지연)
	 *  
	 *  * 자바에서 제공하는 스트림 클래스
	 *  > 통로의 사이즈(1byte / 2byte)
	 *  - 바이트 스트림 : 1byte만 지나 갈 수 있은 사이즈(좁은 통로)
	 *  			  입력(InputStream)/출력(OutputStream)			
	 *  - 문자 스트림 : 2byte 데이터가 지나갈 수 있는 통로(넓은 통로)
	 *				 입력(Reader)/출력(Writer)  
	 *
	 *	> 외부매체와 직접 연결 유무
	 *  
	 *  	- 기반(기본) 스트림 : 외부매체와 직접적으로 연결하는 통로
	 *
	 *  
	 *  	- 보조 스트림 : 보조 역할 만 수행하는 통로 
	 *  				단독으로는 사용 불가(반드시 외부 매체와 연결 되어있는 기반 스트림 필요!!)
	 *  
	 *  
	 */
	
	
	
	
}
