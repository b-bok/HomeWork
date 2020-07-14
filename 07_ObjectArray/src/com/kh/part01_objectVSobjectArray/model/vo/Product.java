package com.kh.part01_objectVSobjectArray.model.vo;

public class Product {

	private String name; 	 // ��ǰ��
	private String brand;	 // �귣���
	private int price; 		 // ����

	
	// �⺻ ������
	public Product() {}
	// �Ű� ���� ������
	public Product(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	// setter/getter �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// information �޼ҵ�
	public String information() {
		return "name : " + name + ", brand : " + brand + ", price : " +  price;
	}
	
	
	
}