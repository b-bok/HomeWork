package com.kh.chap04_assist.part02_object.model.dao;

import java.io.*;

import com.kh.chap04_assist.part02_object.model.vo.*;

public class ObjectDao {

	// 프로그램 --> 파일(출력)
	public void fileSave() {
		// 파일에 기록할 Phone 객체 생성
		Phone ph = new Phone("갤럭시","삼성",1500000);
		
		// 객체 자체를 파일에 출력할 때 사용되는 스트림
		//ObjectOutputStream : 객체 단위로 출력 가능한 메소드 제공
		//FileOutputStream : 파일에 출력시 사용되는 기반 스트림
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"));) {
			
			oos.writeObject(ph); // 출력할 객체 클래스는 직렬화 선언도 해줘야함!
			
	
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
	}
	
	

	// 프로그램 --> 파일 (입력)
	public void fileRead() {
		
		
		// 파일에 기록된 객체 단위로 입력 받기 위한 스트림 클래스	
		
		
		// ObjectInputStream : 객체 단위로 읽기 위한 보조 스트림 클래스
		// FileInputStream : 파일의 기록을 입력받기 위한 기반 스트림 클래스
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"));) {
			
			// 객체 단위로 데이터를 읽어들일 때 : readObject() 메소드 사용
			
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}
}
