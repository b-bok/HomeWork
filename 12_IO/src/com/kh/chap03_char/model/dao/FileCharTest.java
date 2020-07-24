package com.kh.chap03_char.model.dao;

import java.io.*;


public class FileCharTest {

	
	//프로그램 --> 파일(출력 : 프로그램상 데이터를 파일로 내보내겠다!)
	
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2byte 단위로 출력하겠음!
		
		
		
		// 1. FileWriter 객체 생성
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. 통로로 데이터 출력 : write() 메소드 이요
			fw.write('A');
			fw.write(' ');
			fw.write("와! IO 재밌다...");
			fw.write("\n");
		
			// 3. char[] 배열 전송 가능
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			// 3. 다 쓴 자원 반납 하기!
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		*/
		
		
		// 해당 스트림 다 쓴 후 자동으로 close() 까지 해주는 구문
		// try with resource 구문
		
		/* try(스트림 객체 생성하는 구문) {
		 * 
		 * } catch(예외클래스명 e) {
		 * 
		 * 
		 * }
		 * 
		 */
		
		
		
		try(FileWriter fw = new FileWriter("b_char.dat");
				/*FileReader fr = new FileReader("b_char.dat");*/) {
				// 추가적으로 다른 클래스 객체 생성도 가능하다.
			
			
			// 2. 통로로 데이터 출력 : write() 메소드 이요
			fw.write('A');
			fw.write(' ');
			fw.write("와! IO 재밌다...");
			fw.write("\n");
		
			// 3. char[] 배열 전송 가능
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	
	
	
	// 프로그램 <---- 파일(입력 : 파일로부터 프로그램으로 읽어오기)
	
	public void fileRead() {
		
		//FileReader : 파일로 데이터 2byre 단위로 입력받기
		
		
		//1. FileReader 객체 생성
	
		try(FileReader fr = new FileReader("b_char.dat");) {
			
			//2. 통로를 통해서 데이터 입력 받아오기 : read() 메소드
			// 마찬가지로 파일의 끝은 -1을 반환
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			
		}/* catch (FileNotFoundException e) { // IOException의 자식 클래스로 있어도 되고, 없어도 되고
			e.printStackTrace(); 			  // 있으면 더욱 자세한 예외를 확인 가능	
		}*/ catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
