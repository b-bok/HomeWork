package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	
	// ���α׷� (�ڹ� �ڵ�)  --> �ܺθ�ü(����) (���) (��� : ���α׷� ���� �����͸� ���Ϸ� ��������, ���Ͽ� �����Ѵ�!)
	
	public void fileSave() {
		// FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		FileOutputStream fos = null;
		
		
		try {
			// 1. FileOutputStream ��ü ���� : �ش� ���ϰ������ �������
			fos = new FileOutputStream("a_byte.txt"); // ���� ������ �ڵ� ����, �̹� �ִٸ� �ٷ� ����
			// true �ۼ���  --> ������ �ش� ���� ���� ��� ���̾� �ۼ�
			// true alwkrtldtl --> ������ �ش����Ͽ� �����(�⺻�� false)
			
			
			
			
			
			// 2. ��η� ������ ��� : write() �޼ҵ� ���
			//	    ��, 1����Ʈ ������ �ۿ� ������ ��� �Ұ�
			fos.write(97);	// ���ڰ� �״�� ����Ǵ� �� �ƴ�, �ش� ������ �ƽ�Ű �ڵ�(0~127)�� ���� �߻�
			fos.write('b');
			//fos.write('��'); // �ѱ��� 2byte¥���̱� ������ 1byte ��η� ���޽� ������ ��ϵ�!!

			
			// ����Ʈ �迭�� ��� ����
			byte[] bArr = {99,100,101};	//cde

				fos.write(bArr);
				
				//fos.write(�迭, �����ε���, ����) ==> �迭�� �����ε������� ������ŭ ���
				fos.write(bArr,1,2);	// de
			
			// 3. ��Ʈ�� �� �̿� �� �ݳ�(close�޼ҵ� �̿�)	
		
			
				
			
		} catch(FileNotFoundException e) { //�������� �ʴ� ��ο� ������ ������ �� ���� �߻�
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// � ���ܰ� �߻� �ϵ� ���� �ݵ�� ������ ���� ���
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	// ���α׷�(�ڹ� �ڵ�) <-- ����(�Է� : ���Ͽ� ��ϵ� ������ ��������)
	public void fileRead() {
		
		//FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է� �޴� ��Ʈ��
		
		
		//1. FileInputStream ��ü ���� : �ش� ���� ���� ��� ����
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			//2. ���Ϸκ��� �����͸� �Է��ϰ��� �� �� read() �޼ҵ� ���
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read()); // -1 ������ ��
			System.out.println(fis.read()); // -1 ������ ��
			*  
			*/
			
			// ��� �дٰ� ������ ���� ���� -1�� ��ȯ�ϴ� �� �ľ�
			 
			/* ���� �˻�� �о�� ���� ����ؾ������� ���������� ����ϴ°��� �ٽ� �о�� ��
			 * 
			while((1)(3)(5)fis.read() != -1) { // �о�� ���� -1 �ƴ� ��츸 ��� �ǰԲ�
				
				(2)(4)(6)System.out.println(fis.read());
			}
			*/
			
			//fis.read()�� �ݺ����� ����ɶ� ���� �� �ѹ��� ����Ǿ���Ѵ�!
			
			// �ذ���1. ���ѹݺ����� �����鼭 ���ǰ˻�
			
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.print(value + " ");
				}else {
					break;
				}
			}
			*/
			
			// �ذ���2. ������
			int value = 0; // �Ź� �Է� �޾ƿ� ������ ����� ���� �����α�
			
			while((value = fis.read()) != -1) {
				
				System.out.print((char)value + " ");
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
}
