package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  *���� ��� ��Ʈ�� : �ܺθ�ü ������ 2byte ������ �����͸� ���� ������ ��θ� ���� ������ ����
		 *  
		 *  "���� ��� ��Ʈ��" : 2byte ������ ������ ���� ������ ��Ʈ��
		 *  "�⺻(���) ��Ʈ��" : �ܺθ�ü�� ���������� �����ϴ� ��� ����
		 * 
		 * 
		 *  XXXReader : XXX��ü�κ��� ������ �Է� ���
		 *  XXXWriter : XXX��ü�� ������ ���
		 *  
		 *  
		 */
		
		
		FileCharTest fc = new FileCharTest();
		
		fc.fileRead();
	}

}
