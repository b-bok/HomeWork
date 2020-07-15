package com.kh.part02_mvc.controller;

import com.kh.part02_mvc.model.vo.Person;

// Controller : View(화면)에서 사용자가 요청한 것을 처리하는 기능용 클래스


public class PersonController {
	// 우선 세명의 회원 객체 관리 위한 배열셋팅
	private Person[] people = new Person[3];
	
	// 현재 추가된 사람수를 나타내는 변수
	private int count = 0;
	
	public int insertPerson(String name, int age, int wealth) {
		
		if(count < people.length) { // 추가가능
			
			people[count++] = new Person(name, age, wealth);
			
			//System.out.println("성공적으로 추가되었습니다.");
			
			return 1; 
		}else { //추가 불가
			
			//System.out.println("현재 인원이 다 찬 관계로 추가가 불가능합니다.");
			
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
		
		return searchPerson; //검색된 회원객체 또는 null값 리턴
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
