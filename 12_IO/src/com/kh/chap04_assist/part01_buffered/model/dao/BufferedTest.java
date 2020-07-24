package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.*;

public class BufferedTest {

	// 프로그램 --> 파일(출력)
	
	public void fileSave() {
		
		/*
		//1. 기반스트림 객체 생성(어떤 외부매체와 데이터 주고 받을지 선택 후!)
		
		
		FileWriter fw = new FileWriter("c_buffer.dat");
			
		//2. 보조 스트림 생성(해당 기반 스트림 객체를 담은 채 생성 한다!)
		BufferedWriter bw = new BufferedWriter(fw);
		*/	
			
		
		// 위의 과정을 한줄로 줄여보자!
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"));) {
			
			// 데이터 출력 : write()
			bw.write("안녕하세요\n");
			bw.write("반갑습니다!");
			// 버퍼라는 공간에 쌓아서 한번에 출력 --> 속도향상 굿!
			
			// 개행 하고싶다!
			bw.newLine(); // 기반 스트림에서 제공하지 않는 메소드 사용가능! // 매우 유용!
			bw.write("저리가세요!");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	public void fileRead() {
		
		// BufferedReader 객체 생성
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"));) {
			
			
			// 파일의 끝에서는 null값을 반환
			
			String value = null;
			
			while((value = br.readLine()) != null) {
				
				System.out.println(value);
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
