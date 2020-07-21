package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	
	public void method1() {
		
		/*
		 * * String Ŭ����
		 * - �Һ� Ŭ����(������ �ʴ� Ŭ����)
		 * 		--> �����ϴ� ���� ���ڸ����� ���� ���� ����
		 */
		
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2); // flase(�ּҰ� �ٸ�)
		
		System.out.println(str1);
		System.out.println(str2);
		//toString() -->String Ŭ������ �̹� �������̵� �Ǿ�����
		
		System.out.println(str1.equals(str2)); // true(������� ���ڿ��� ��)
		// equals()  --> String Ŭ������ �̹� �������̵� �Ǿ�����(���� ��� ���ڿ��� ��)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() -->String Ŭ������ �̹� �������̵� �Ǿ�����(���� ��� ���ڿ��� �ּҸ� ���� ������)
		
		
		// ���࿡ ���� ���� �ּҰ��� �˰� �ʹٸ� System.identityHashCode(���۷���) �̿�	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	public void method2() {
		
		//	2. ���ڿ��� ���ͷ��� ����
		String str1 = "hello";
		String str2 = "hello";
		// ���ͷ� ���ý� StringPool ������ �ö�
		// String Pool Ư¡: ������ ���ڿ� ���� �Ұ�
		
		
		String str3 = new String("hello");
		
		System.out.println(str1 == str2); // true (�ּҰ� ��ġ)
		// stack heap static ��������
		// heap �������� StringPool�� ����
		// ���ڿ� ���ͷ��� StringPool�� ��
		// ���Ǯ�� ������ ���ڿ��� �������� �ʴ´�!
		// ���� str1�� str2�� ���� ���� �ٶ󺸰� �ִٰ� �� �� �ִ�.
		// ������ �ִ� �ּҰ��� str2���� �����ϴ� ���̴�.
		// ���ͷ��� �ƴ� ��ü ���� ������ ��� StringPool�� �ƴ� Heap������ �Ҵ� ��
		// �׷��� str2 != str3
		
		
		// StringPool�� ���� �ּҰ��� �����ϰ� �����Ƿ� ��¥ �ּҰ��� ���� ����
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		// �Һ� Ŭ����(������ �ʴ� Ŭ���� == ���ڸ����� �����Ǵ� ���� �ƴ�)
		
		str2 = "bcd";
		System.out.println(System.identityHashCode(str2));
		// ���ڿ� �����ϴ� ���� ������ ���ڿ��ڿ��� ����Ǵ� ���� �ƴ�
		// ���ο� ���� �Ҵ�(���ο� �ּҰ��� ���� == �ּҰ� ����)
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		
		
		str2 = "eee";
		System.out.println(System.identityHashCode(str2));
				
		/*
		 * 
		 *  String Ŭ���� == �Һ� Ŭ����
		 *  --> ��� ���� �����ϴ� ��� �������÷���(GC)�� ��� ������߸� �ϴ� ���� ����
		 *  
		 * 
		 * 
		 */
			
		str2 ="hello";
		System.out.println(System.identityHashCode(str2));
		
		
	}
}
