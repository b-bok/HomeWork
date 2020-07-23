package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {


	public static void main(String[] args) {

		// ���� ��������°Ϳ� ���� ���� �׽�Ʈ
		// java.io ��Ű���� �ִ� File Ŭ���� ������ ���ϸ� ����
		
		
		// 1. ������� ���� ���� ���� --> �ش� �� ������Ʈ�� ���� ����

		try {
			File f1 = new File("texs.txt");
			f1.createNewFile();
			
			
			//2. �����ϴ� ���� ����̹��� ������ ���� ����
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			System.out.println("\t \n \"\" ");
			
			
			//3. ���� ����� ���� ����
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); 	//make directory
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// .exists ==> �� ������ ���� �մϱ�?
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			System.out.println("������ : " + file.getAbsolutePath()); //�������� ���
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();	// ���ܹ߻��� ��� �ߴ��� �˷��ִ� �޼ҵ�
		}
		
		System.out.println("����!");
	
		System.out.println();
	}

	
	/*
	 * 
	 *  ���α׷� ���� �����͸� �ܺ� ��ü�� ����� �Ѵٰų�/ �Ǵ� �ܺ� ��ü�κ��� �Է��� �޾� �ö�
	 *  �ݵ�� �� �ܺθ�ü�� �������� ��θ� ������ �Ѵ�! => �װ� �ٷ� ��Ʈ��
	 *  
	 *  * ��Ʈ���� Ư¡
	 *  - �ܹ��� : �Է°� ����� ������ �� �� ����(�� ����� ���ؼ� ���� ��Ʈ���� ��������)
	 *  - ���Լ��� : ���� �������� ���� ����(�ð� ����)
	 *  
	 *  * �ڹٿ��� �����ϴ� ��Ʈ�� Ŭ����
	 *  > ����� ������(1byte / 2byte)
	 *  - ����Ʈ ��Ʈ�� : 1byte�� ���� �� �� ���� ������(���� ���)
	 *  			  �Է�(InputStream)/���(OutputStream)			
	 *  - ���� ��Ʈ�� : 2byte �����Ͱ� ������ �� �ִ� ���(���� ���)
	 *				 �Է�(Reader)/���(Writer)  
	 *
	 *	> �ܺθ�ü�� ���� ���� ����
	 *  
	 *  	- ���(�⺻) ��Ʈ�� : �ܺθ�ü�� ���������� �����ϴ� ���
	 *
	 *  
	 *  	- ���� ��Ʈ�� : ���� ���� �� �����ϴ� ��� 
	 *  				�ܵ����δ� ��� �Ұ�(�ݵ�� �ܺ� ��ü�� ���� �Ǿ��ִ� ��� ��Ʈ�� �ʿ�!!)
	 *  
	 *  
	 */
	
	
	
	
}
