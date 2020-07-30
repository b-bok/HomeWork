package com.kh.chap03_map.properties.run;

import java.io.*;
import java.util.*;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
	

		// Properties : Map계열 => Key, Value 세트로 저장
		// 단, Key, Value 값이 스트링
		
		
		 Properties prop = new Properties();
		 
		 /* 
		 * // Map계열 put메소드 사용가능하긴 함!
		 * 
		 * prop.put("다이제", new Snack("단맛", 1500));
		 * 
		 * System.out.println(prop); System.out.println(prop.get("다이제"));
		 * 
		 * // 단, Properties를 사용하는 목적은 보통 파일로 출력하고 블러올 때 사용함 // store() 메소드, load() 메소드
		 * 
		 * try { //java.lang.ClassCastException 자바에서는 상관없으나 입력할 때는 모두다 String이어야한다!
		 * prop.store(new FileOutputStream("test.properties"), "Properties Test");
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		
		// setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 순서 유지 x, key값 중복시 나중의 value으로 덮어씌워짐
		
		// 개발자가 아닌 사람들도 수정하기 쉽도록 쓰는 역할 ==> properties
		
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
