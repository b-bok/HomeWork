package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic {
	// 다이어그램 표기시 비어있는 화살표 = 상속 // 점선 + 비어있는 화살표 = 인터페이스
	
	private String babyBirth; // 아이의 탄생정보 : 출산, 입양, 없음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name,weight,health);
		this.babyBirth = babyBirth;	
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	
	@Override
	public String toString() {
		return "Mother [ " + super.toString() + ", 아이의 탄생 정보 : " + babyBirth + "]" ;
		
	}
	
	@Override
	public void eat() {
		
		//몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		
		
		//건강도 10 감소
		super.setHealth(super.getHealth() - 10);
		
	}
	
	@Override
	public void sleep() {
		
		//건강도 10 증가
		super.setHealth(super.getHealth() + 10);
		
	}
	
	
	
	
}
