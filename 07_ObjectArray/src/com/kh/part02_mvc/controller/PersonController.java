package com.kh.part02_mvc.controller;

import com.kh.part02_mvc.model.vo.Person;

// Controller : View(ȭ��)���� ����ڰ� ��û�� ���� ó���ϴ� ��ɿ� Ŭ����


public class PersonController {
	// �켱 ������ ȸ�� ��ü ���� ���� �迭����
	private Person[] people = new Person[3];
	
	// ���� �߰��� ������� ��Ÿ���� ����
	private int count = 0;
	
	public int insertPerson(String name, int age, int wealth) {
		
		if(count < people.length) { // �߰�����
			
			people[count++] = new Person(name, age, wealth);
			
			//System.out.println("���������� �߰��Ǿ����ϴ�.");
			
			return 1; 
		}else { //�߰� �Ұ�
			
			//System.out.println("���� �ο��� �� �� ����� �߰��� �Ұ����մϴ�.");
			
			return 0;
		}
		
	}
	
	public int getCount() {
		return count;
	}
	
	public Person[] selectList() {
		
		/*
		for(int i = 0; i<count; i++) {
			System.out.println(people[i].information());
		}
		*/
		
		return people;
	}
	
	public Person searchPerson(String name) {
		
		Person searchPerson = null;
		
		for(int i = 0; i<count; i++) {
			if(people[i].getName().equals(name)) {
				searchPerson = people[i];
			}
		}
		
		return searchPerson; //�˻��� ȸ����ü �Ǵ� null�� ����
	}
	
	
	public double wealthAverage() {
		
		double sumWealth = 0;

		for(int i = 0; i<count; i++) {
			
			sumWealth += people[i].getWealth();
		}
		if(sumWealth == 0) {
			return 1;
		}else {
			
			return (sumWealth/count);
		}
		
	}
}
