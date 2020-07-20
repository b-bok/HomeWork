package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sport {

	private int people; //해당 스포츠 참여 하는 사람 수
	
	public Sport() {}
	
	
	public Sport(int people) {
		this.people = people;
				
	}


	public int getPeople() {
		return people;
	}


	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "참여하는 명수 : " + people + "명";
	}
	
	
	// 추상메소드(미완성된 메소드)
	public abstract void rule(); // 머리부만 있는 상태

	/* 몸통부가 없다!
	{
		
	}
	*/
	
	/*
	 *  추상메소드(미완성된 메소드로 내용구현이 되어있지 않은 메소드)
	 *  --> 몸통부가 구현되어있지 않음
	 * 	--> 미완성된 추상메소드가 현재 이클래스에 있다는 소리 ==이 클래스 역시 미완성 클래스 == 추상클래스로 작업하라
	 */
	
	
	
}
