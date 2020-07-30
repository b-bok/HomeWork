package com.kh.chap03_map.properties.run;

import java.io.*;
import java.util.*;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
	

		// Properties : Map�迭 => Key, Value ��Ʈ�� ����
		// ��, Key, Value ���� ��Ʈ��
		
		
		 Properties prop = new Properties();
		 
		 /* 
		 * // Map�迭 put�޼ҵ� ��밡���ϱ� ��!
		 * 
		 * prop.put("������", new Snack("�ܸ�", 1500));
		 * 
		 * System.out.println(prop); System.out.println(prop.get("������"));
		 * 
		 * // ��, Properties�� ����ϴ� ������ ���� ���Ϸ� ����ϰ� ���� �� ����� // store() �޼ҵ�, load() �޼ҵ�
		 * 
		 * try { //java.lang.ClassCastException �ڹٿ����� ��������� �Է��� ���� ��δ� String�̾���Ѵ�!
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
		
		System.out.println(prop); // ���� ���� x, key�� �ߺ��� ������ value���� �������
		
		// �����ڰ� �ƴ� ����鵵 �����ϱ� ������ ���� ���� ==> properties
		
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
