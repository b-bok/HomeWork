package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book bk1 = new Book("����������","������",10000);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 20000);
		
		// * toString()
		// �������̵��� : Objcet Ŭ������ toString() ������������ �ּҰ�...
		
		// �������̵� �� : BookŬ����(�ڽ� Ŭ����)�� �������� toString �޼ҵ� ����  => ��� �ʵ尪 �ϳ��� ���ڿ��� ���ļ� ��ȯ
		
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		//��¹����� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� �ش� ���۷���.toString() �޼ҵ� ȣ�� ����
	}

}
