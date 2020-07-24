package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.*;

public class BufferedTest {

	// ���α׷� --> ����(���)
	
	public void fileSave() {
		
		/*
		//1. ��ݽ�Ʈ�� ��ü ����(� �ܺθ�ü�� ������ �ְ� ������ ���� ��!)
		
		
		FileWriter fw = new FileWriter("c_buffer.dat");
			
		//2. ���� ��Ʈ�� ����(�ش� ��� ��Ʈ�� ��ü�� ���� ä ���� �Ѵ�!)
		BufferedWriter bw = new BufferedWriter(fw);
		*/	
			
		
		// ���� ������ ���ٷ� �ٿ�����!
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"));) {
			
			// ������ ��� : write()
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�!");
			// ���۶�� ������ �׾Ƽ� �ѹ��� ��� --> �ӵ���� ��!
			
			// ���� �ϰ�ʹ�!
			bw.newLine(); // ��� ��Ʈ������ �������� �ʴ� �޼ҵ� ��밡��! // �ſ� ����!
			bw.write("����������!");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	public void fileRead() {
		
		// BufferedReader ��ü ����
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"));) {
			
			
			// ������ �������� null���� ��ȯ
			
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
