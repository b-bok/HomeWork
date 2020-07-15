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
	 * *�������̵�
	 * - �ڽ� Ŭ������ ��ӹް� �ִ� �θ� Ŭ������ �޼ҵ带 ������ �ϴ� ��
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ� Ŭ������ �Ϻ� ���� ����Ѵٴ� ��
	 * 		�ش� �޼ҵ� ȣ��� �ڽ� Ŭ���� �޼ҵ尡 �켱������ ����
	 * 
	 * *�������̵� ��������
	 * - �θ�Ŭ������ �޼ҵ��� ��ġ�ؾߵ�
	 * - �Ű������� ��ġ�ؾ���
	 * - ��ȯ�� ��ġ�ؾ���(�θ�޼ҵ� ��ȯ���� �ڽ��ڷ�������� ��밡��)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ����
	 *	ex)�θ�޼ҵ� ���������� protected�� ���, �������̵��ϴ� ���������ڴ� protected , public
	 * 
	 * --> �Ծ��� ����
	 * 
	 * 
	 *  *@ Override ������̼�
	 *  - ��� ���� �ʾƵ� ũ�� ��� ����.
	 *  - ������ ���̴°� ����!!
	 *  - �θ� �޼ҵ���̳� �Ű������� �ٸ� ��� ���� �߻�������
	 *  -  The method toStr() of type Book must override or implement a supertype method
	 */
	
	
	// Object Ŭ������ �ִ� toStirng �޼ҵ� �������̵�
	@Override
	public String toString() {
		
		return "title : " +title + ", author  : " + author + ", price : " +  price;
		
	}
	
	
	
	
}
