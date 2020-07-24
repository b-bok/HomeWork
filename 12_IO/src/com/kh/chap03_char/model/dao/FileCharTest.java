package com.kh.chap03_char.model.dao;

import java.io.*;


public class FileCharTest {

	
	//���α׷� --> ����(��� : ���α׷��� �����͸� ���Ϸ� �������ڴ�!)
	
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2byte ������ ����ϰ���!
		
		
		
		// 1. FileWriter ��ü ����
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' ');
			fw.write("��! IO ��մ�...");
			fw.write("\n");
		
			// 3. char[] �迭 ���� ����
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			// 3. �� �� �ڿ� �ݳ� �ϱ�!
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		*/
		
		
		// �ش� ��Ʈ�� �� �� �� �ڵ����� close() ���� ���ִ� ����
		// try with resource ����
		
		/* try(��Ʈ�� ��ü �����ϴ� ����) {
		 * 
		 * } catch(����Ŭ������ e) {
		 * 
		 * 
		 * }
		 * 
		 */
		
		
		
		try(FileWriter fw = new FileWriter("b_char.dat");
				/*FileReader fr = new FileReader("b_char.dat");*/) {
				// �߰������� �ٸ� Ŭ���� ��ü ������ �����ϴ�.
			
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' ');
			fw.write("��! IO ��մ�...");
			fw.write("\n");
		
			// 3. char[] �迭 ���� ����
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	
	
	
	// ���α׷� <---- ����(�Է� : ���Ϸκ��� ���α׷����� �о����)
	
	public void fileRead() {
		
		//FileReader : ���Ϸ� ������ 2byre ������ �Է¹ޱ�
		
		
		//1. FileReader ��ü ����
	
		try(FileReader fr = new FileReader("b_char.dat");) {
			
			//2. ��θ� ���ؼ� ������ �Է� �޾ƿ��� : read() �޼ҵ�
			// ���������� ������ ���� -1�� ��ȯ
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			
		}/* catch (FileNotFoundException e) { // IOException�� �ڽ� Ŭ������ �־ �ǰ�, ��� �ǰ�
			e.printStackTrace(); 			  // ������ ���� �ڼ��� ���ܸ� Ȯ�� ����	
		}*/ catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
