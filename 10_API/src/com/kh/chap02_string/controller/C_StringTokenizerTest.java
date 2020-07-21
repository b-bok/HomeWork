package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		
		
		// �����ڸ� �̿��Ͽ� �ش� ���ڿ� �и� ��Ű�� ���
		
		
		// ���1. �и��� ���ڿ����� �迭�� �������� ��Ƽ� ó���ϰ� ���� ��
		// 		 String Ŭ������ �����ϴ� split �޼ҵ� �̿�
		// 	  	 ���ڿ�.split(String ������) : String[]
		
		String[] arr = str.split(",");
	
		System.out.println("�и� �� ���ڿ��� ����  : " + arr.length);
		
		/*
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// ���2. �и��� ������ ���ڿ����� ��ü�� ����ϰ� ���� ��
		// 		 StringTokenizer Ŭ������ �̿��ϴ� ���
		//		StringTokenizer stn = new StringTokenizer(�и� ��Ű�����ϴ� ���ڿ�, ������);
		
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		// str ���ڸ� �и��ؼ� Token�� �����Ѵ�.
		
		// stn�� ��� Token�� �ֳ���? --> countTokne(); �޼ҵ带 ����Ѵ�!
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		/*
		// stn �������� Token�� ������ �ʹٸ�? --> nextToken(); ���!
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		
		System.out.println("���� ���� ��ū ���� : " + stn.countTokens());
		*/
		
		/*
		int A = stn.countTokens(); //6
		
		for(int i = 0; i<A;i++) {
			
			System.out.println(stn.nextToken());

		}
		*/
		
		
		// hasMoreTokens --> ��ū�� �����ִٸ� true ��ū�� ���ٸ� false
		
		while(stn.hasMoreTokens()) {
			
			System.out.println(stn.nextToken());
			
		}
		
		
		
	}
	
	
	
	
	public void method2() {
		
		String colors = "red/yellow#green blue,orange";
		
		System.out.println("split ��� ����ϱ� ");
		
		//split���
		String[] arr = colors.split("[/# ,]");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println("\nStringTokenizer ��� ����ϱ� ");
		
		//StirngTokenizer ���
		StringTokenizer stn = new StringTokenizer(colors,"/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		
		
		
		
		
		
		
	}
}
