package com.kh.chap02_set.part01_hashSet.model.vo;

public class Person {

	
	private String name;
	private int age;
	private int score;
	
	public Person() {}
	
	
	public Person(String name, int age, int score) {
	
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	
	// generate hashCode와 equals 자동완성

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)	// null 값이면 묻지도 따지지도 않고 false
			return false;
		if (getClass() != obj.getClass()) //클래스가 다르면 묻지도 따지지도 않고 false
			return false;
		Person other = (Person) obj;	// 지금부터 클래스 값들 일일히 비교!
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	

	
}
