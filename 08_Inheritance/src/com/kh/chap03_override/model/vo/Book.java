package com.kh.chap03_override.model.vo;

public class Book {

	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title,String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String infomation() {
		return title + "\t" + author + "\t" + price;
	}
	
	/*
	 * 
	 * *오버라이딩
	 * - 자식 클래스가 상속받고 있는 부모 클래스의 메소드를 재정의 하는 것
	 * - 부모가 제공하는 메소드를 자식 클래스가 일부 고쳐 사용한다는 뜻
	 * 		해당 메소드 호출식 자식 클래스 메소드가 우선순위를 가짐
	 * 
	 * *오버라이딩 성립조건
	 * - 부모클래스의 메소드명과 일치해야됨
	 * - 매개변수가 일치해야함
	 * - 반환형 일치해야함(부모메소드 반환형의 자식자료형들까지 허용가능)
	 * - 부모메소드의 접근제한자보다 범위가 같거나 커야함
	 *	ex)부모메소드 접근제한자 protected일 경우, 오버라이딩하는 접근제한자는 protected , public
	 * 
	 * --> 규약의 개념
	 * 
	 * 
	 *  *@ Override 어노테이션
	 *  - 명시 하지 않아도 크게 상관 없다.
	 *  - 하지만 붙이는게 좋다!!
	 *  - 부모 메소드명이나 매개변수가 다를 경우 오류 발생시켜줌
	 *  -  The method toStr() of type Book must override or implement a supertype method
	 */
	
	
	// Object 클래스에 있는 toStirng 메소드 오버라이딩
	@Override
	public String toString() {
		
		return "title : " +title + ", author  : " + author + ", price : " +  price;
		
	}
	
	
	
	
}
