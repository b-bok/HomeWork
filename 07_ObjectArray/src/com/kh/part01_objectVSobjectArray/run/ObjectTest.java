package com.kh.part01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.*;

public class ObjectTest{

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		Book bk2 = new Book("�ڹ�������","������",10000,"KH");
		Book bk3 = new Book();
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//����ڿ��� �� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		// 1. ��ü ���� ���� �Է¹ޱ�
		for(int i = 0; i<3; i++) {
			
			System.out.println(i + 1 + "��° ���� ���� �Է�");
			
			System.out.print("����  : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("���ǻ� :");
			String publisher = sc.nextLine();
			
			// ����ó�� ������ ������ϴ� ������...
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
				
			
		}
		
		// 2. ��ü ���� ���� ���
		// �ݺ����� ���Ұ��ϴ���...
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 3. ���� ���� �˻��ϱ�
		System.out.print("�˻��� å ���� �Է��� �ּ��� : ");
		String search = sc.nextLine();
		
			if(search.equals(bk1.getTitle())) {
				System.out.println(bk1.information());
				
			}
			if (search.equals(bk2.getTitle())) {
				System.out.println(bk2.information());
				
			}
			
			if (search.equals(bk3.getTitle())) {
				System.out.println(bk3.information());
				
			} else {
				System.out.println("ã���ô� å�� �����ϴ�.");
			}
		
		
		
		
		
	}

}
