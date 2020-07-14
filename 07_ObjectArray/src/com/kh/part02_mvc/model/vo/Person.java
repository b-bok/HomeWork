package com.kh.part02_mvc.model.vo;

// Model : 데이터 관련한 역할 담당
// vo(ValueObject) : 데이터 값을 담기 위한 용도의 클래스
public class Person {

	private String name; // 이름
	private int age; // 나이
	private int wealth; // 재산
	
	
	// 기본 생성자
	
	public Person() {}
	
	// 매개 변수 생성자
	
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	// setter/getter 메소드
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	public int getWealth() {
		return wealth;
	}
	
	// information 메소드
	
	public String information() {
		return "이름 : " + name + ", 나이 : " + age + ", 재산 : " + wealth;
	}
}
