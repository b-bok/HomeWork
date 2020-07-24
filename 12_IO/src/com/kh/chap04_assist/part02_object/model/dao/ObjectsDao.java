package com.kh.chap04_assist.part02_object.model.dao;



import java.io.*;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {

	// ���α׷� --> ����( ���)
	public void fileSave() {

		Phone[] arr = new Phone[3];
		arr[0] = new Phone("������","LG", 1000000);
		arr[1] = new Phone("������","�Ｚ",1300000);
		arr[2] = new Phone("������","����",1500000);
		
		// ��ü ������ ���� ��½� ���Ǵ� ��Ʈ�� Ŭ����
		// ObjectOutputStrem : ��ü������ ���� ��°����� ���� ����Ʈ ��Ʈ��
		// FileOutputStrea : ���ϰ� ���� �����Ͽ� ������ ��������� ��� ����Ʈ ��Ʈ��
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.dat"))) {
		
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(int i = 0; i<arr.length;i++) {
				oos.writeObject(arr[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	// ���α׷� <--- ���� (�Է�)
	
	public void fileRead() {
		
		// ���Ͽ� ��ϵ� �����͸� ��ü������ �Է¹޾ƿ� �� �ʿ��� ��Ʈ��
		// 
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.dat"))){
			// read() : -1 ��ȯ
			// readLine() : null ��ȯ
			// readObject() : EOFException �߻� (EOF : End Of File)
			
			
			while(true) {
				
					System.out.println(ois.readObject());

			}

		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch(EOFException e) {
			
			System.out.println("������ �� �о���");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
