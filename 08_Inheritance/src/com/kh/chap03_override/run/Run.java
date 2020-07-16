package com.kh.chap03_override.run;

import com.kh.chap01_beforeVSafter.after.model.vo.*;
import com.kh.chap02_inherit.model.vo.*;
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
		
		
		
		//equals(), hashCode() �� ������ �۾��غ� ��!!
		Book bk3 = new Book("����������","������",10000); //  bk1�� ������ �ʵ尪�� ���� bk3��ü ����
		
		System.out.println("bk1�� bk3�� ���� å�ΰ�? : " + (bk1 == bk3));
		
		// ���۷������� �������� ���� �� equals() �޼ҵ� ��� ����
		
		// �������̵� �� : ObjectŬ������ equals�޼ҵ� --> �� �ּҰ��� ������ ��
		
		System.out.println("bk1�� bk3�� ����å�ΰ�? : " + (bk1.equals(bk3)));
		
		
			
		// ���� ��ü : ������ �ʵ尪�� ���� �ؽ��ڵ尪�� ��ġ�ϴ� ���(���� ��ü�� ����� ���ؼ� equals�� hasCode ���� ������Ѵ�!)
		
		// �������̵� �� : ObjectŬ������ hashCode�޼ҵ� --> "���� �ּҰ� ���̽�"�� 10������ ����� ��� ��ȯ
		// �������̵� �� : BookŬ������ hashCode�޼ҵ� --> �� ��ü�� �ʵ尪�� ���̽��� 10���� ����� ��� ��ȯ
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
		System.out.println(bk3.hashCode());
		
		
		
		// ������ �ѹ� �غ���!!
		Object[] arr = new Object[10];
		arr[0] = new Book();
		arr[1] = new Airplane();
		arr[2] = new Tv();
		
		
		
		
		
		//------------------------------------------------------------
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // �ܼ��� �ּҰ� ��
		System.out.println(str1.equals(str2));
		
		System.out.println(str1 /* .toString() */);
		System.out.println(str2 /* .toString() */);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
