package com.kh.exception.controller;

import java.io.*;


public class CheckedException {

	// CheckedException : �ݵ�� ����ó���� ������ϴ� ���ܵ�!
	//					    ���� �Ұ����� ��Ȳ���� ���� �߻� ==> �̸� ���ܰ� "�߻�"���� �� ����Ͽ� "ó��"�ϴ� ���� ���
	
	// ���� �ܺθŰ�ü�� � ������� �߻��� �� Exception �߻�!!
	
	public void method1() throws IOException  {
		/*
		try {
			
			method2();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		method2();
		
	}
	
	public void method2() throws IOException {
	
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(��, ���ڿ��θ� ��� ����)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�ƹ��ų� �Է��ض�! : ");
		
		/*
		try {
			
			String str = br.readLine();
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// ����ó�����2. throws : ���� ���� ���⼭ ����ó������ �ʰ� �޼ҵ� ȣ���� ������ ���ѱ褻
		String str = br.readLine();
		System.out.println(str);
		
	}
	
	//						|	���ܹ߻�����		|	����ó��			
	// ==============================================================
	// RuntimeException 	| ��Ÿ�� ����(���α׷� ����)| 	����(�������ɹ���)	--> UnCheckedException
	// RuntimeException �� 	|	������ ����(������)	| 		�ʼ�			--> CheckedException
	
	
	
}
