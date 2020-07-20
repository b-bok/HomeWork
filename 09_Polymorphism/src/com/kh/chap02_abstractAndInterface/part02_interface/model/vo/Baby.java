package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Baby extends Person implements Basic {


	public Baby() {}
	
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
		
	}
	
	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}
	
	@Override
	public void eat() {
		
		//건강도 1증가
		super.setHealth(super.getHealth() + 1);
		//몸무게 3증가
		super.setWeight(super.getWeight() + 3);
		
	}
	
	@Override
	public void sleep() {
		
		//건강도 3증가
		super.setHealth(super.getHealth() + 3);
		
	}
	
}
