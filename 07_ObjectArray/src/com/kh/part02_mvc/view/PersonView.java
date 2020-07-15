package com.kh.part02_mvc.view;

import java.util.Scanner;
import com.kh.part02_mvc.controller.PersonController;
import com.kh.part02_mvc.model.vo.Person;

// View : ������� �ð����� ��� ���(ȭ��)
//			�Է� �� ���
//			���⼭ �������� ȭ��(�޴�)�� ���ؼ� ��û
//			��û == Controller �޼ҵ� ȣ��

public class PersonView {
	// ����ڿ��� �Է¹ޱ� ���� Scanner ��ü ����
	private Scanner sc = new Scanner(System.in);
	// ������� ��û�� ó���� Controller ��ü ����
	private PersonController pc = new PersonController();
	
	
	/**
	 *  ���α׷� ����� ���ÿ� ����ڿ��� �������� ����ȭ��(�޴�)
	 */
	public void mainMenu() {
		
		// ���� �޴��� ���� �ݺ����� ����ְڴ�!(���α׷��� ��� �����ϰԲ�)
		while(true) {
				
			System.out.println("\n===== �޴� =====");
			System.out.println("1. �ű� ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ȸ�� �̸� �˻�");
			System.out.println("4. ȸ�� ��� ��� ��ȸ");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴��� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : selectList(); break;
			case 3 : searchPerson(); break;
			case 4 : wealthAverage(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;// mainMenu�� ����������!;	
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
	}
	
	/**
	 *  ����ȭ��1. �ű�ȸ�� �߰�ȭ��
	 */
	public void insertPerson() {

		System.out.println("\n== �ű� ȸ�� �߰� ==");
		
		
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		sc.nextLine();

		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		
		// ȸ�� �߰����� ��û!!(Controller �޼ҵ� ȣ��)
		int result = pc.insertPerson(name, age, wealth);
		
		if(result == 1) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
		}else {
			System.out.println("���� �ο��� �� �� ����� �߰��� �Ұ����մϴ�.");
		}
		
	}
	
	/**
	 *  ����ȭ��2. ȸ�� ��ü ��ȸ ȭ��
	 */
	
	public void selectList() {
		
		System.out.println("\n== ��ü ȸ�� ��ȸ ==");
		// ���� �߰��� ��� �� ��û!! (Controller �޼ҵ� ȣ��)
		
		int count = pc.getCount();
		
		if(count == 0) { // ���� �߰��� ȸ���� ����!
			
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else {// �Ѹ��̶� �ִ�! => ���������� ��ü ȸ�� ��ȸ ��û!
			
			// ��ü ȸ�� ��ȸ��û!!(Controller �޼ҵ� ȣ��)
		Person[] people = pc.selectList();
		for (int i =0; i<count; i++) {
			
				System.out.println(people[i].information());
			}
			
			
		}
		
	}
	
	/**
	 * 
	 *  ���� ȭ�� 3. ȸ���̸����� �˻��ϴ� ȭ��
	 */
	
	public void searchPerson() {
		System.out.println("\n == ȸ�� ���� �˻� ==");
		
		sc.nextLine();
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		// �˻� ��û�ϱ�!!
		Person searchPerson = pc.searchPerson(name);
		
		if(searchPerson == null) {// �˻��� ��� ����
			System.out.println("�˻��� ȸ���� �����ϴ�.");
		}else {// �˻���!
			System.out.println(searchPerson.information());
		}
		
	}
	
	public void wealthAverage() {	
		
		System.out.println("\n == ȸ�� ��� ��� ��ȸ ==");
		
		double wealthAverage = pc.wealthAverage(); // �޼ҵ� ȣ��, else �ȿ� �־��
		
		int count = pc.getCount(); //ȸ�� �� 
		//if(pc.getCount() == 0)
		if(wealthAverage == 1) {
			System.out.println("ȸ���� ���� ��� ����� ���� �� �����ϴ�.");
		}else {
			// System.out.printf("%.2f\n", wealthAverage);
			System.out.println("�� ȸ���� " + count + "���̸�, ��� ����� : " + wealthAverage);
		}
		
		
	}
}
