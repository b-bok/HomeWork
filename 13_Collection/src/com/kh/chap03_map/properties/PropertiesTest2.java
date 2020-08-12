package com.kh.chap03_map.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		

		Properties prop = new Properties(); // ����ִ� ����
		
		try {
			
			prop.load(new FileInputStream("test.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		//value ���� �˷��� �� ��
		System.out.println(prop.getProperty("List"));
		
		/*
		 * 
		 * 
		 * 
		 *   .properties�� ����ϴ� ����
		 *   1. �ش� ���α׷��� �⺻�������� �ַ� .properties Ȯ���� ������ �����س�����
		 *   	key value ��δ� ���ڿ��̱� ������ �����ڰ� �ƴ� �Ϲ� �����ڰ� �ش� ������ �ٷ�� ����.
		 *   
		 *   
		 *   .xml�� ����ϴ� ����
		 *   1. .xml ������ �پ��� ���α׷��� ���� ȣȯ�� ����.
		 * 
		 */
		
	}

}
