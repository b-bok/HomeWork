package com.kh.chap04_assist.part02_object.model.dao;

import java.io.*;

import com.kh.chap04_assist.part02_object.model.vo.*;

public class ObjectDao {

	// ���α׷� --> ����(���)
	public void fileSave() {
		// ���Ͽ� ����� Phone ��ü ����
		Phone ph = new Phone("������","�Ｚ",1500000);
		
		// ��ü ��ü�� ���Ͽ� ����� �� ���Ǵ� ��Ʈ��
		//ObjectOutputStream : ��ü ������ ��� ������ �޼ҵ� ����
		//FileOutputStream : ���Ͽ� ��½� ���Ǵ� ��� ��Ʈ��
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"));) {
			
			oos.writeObject(ph); // ����� ��ü Ŭ������ ����ȭ ���� �������!
			
	
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
	}
	
	

	// ���α׷� --> ���� (�Է�)
	public void fileRead() {
		
		
		// ���Ͽ� ��ϵ� ��ü ������ �Է� �ޱ� ���� ��Ʈ�� Ŭ����	
		
		
		// ObjectInputStream : ��ü ������ �б� ���� ���� ��Ʈ�� Ŭ����
		// FileInputStream : ������ ����� �Է¹ޱ� ���� ��� ��Ʈ�� Ŭ����
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"));) {
			
			// ��ü ������ �����͸� �о���� �� : readObject() �޼ҵ� ���
			
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
