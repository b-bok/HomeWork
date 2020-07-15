package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	/*
	 * 
	 * 세 클래스 모두 공통적으로 가지고 있는 요소만 추출해서 부모클래스 만듬
	 * 공통적 요소  : brand, pCode, pName, price
	 * 			 setter/getter 메소드
	 * 			 information
	 */
	

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price)  {
		
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return  "브랜드명 : " + brand + ", 상품번호 : " + pCode + ", 상품명 : " + pName + ", 가격 : " + price + "원";
		
	}
	
	
}
