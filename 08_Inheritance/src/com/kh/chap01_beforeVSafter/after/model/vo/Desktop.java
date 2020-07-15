package com.kh.chap01_beforeVSafter.after.model.vo;


//			 자식 클래스  extends	  부모 클래스
public class Desktop extends Product {

	private boolean allInOne;
	
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		
		//super.을 통해서 부모클래스에 접근가능!
		// 단, 접근하고자 하는 필드가 private 일 경우 직접접근 불가!
		
		// 해결방법1. 부모필드를 자식까지만 접근 가능하게끔 protected로 바꾸기
		/*
		super.brand = brand;;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		this.allInOne = allInOne;
		*/
		
		// 해결방법2. 간접적으로 접근가능한 setter메소드 활용하기
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.allInOne = allInOne;
		*/
		
		// 해결방법3. 부모생성자 호출
		
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}
	
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	
	// 재정의 == 오버라이딩
	
	// 부모클래스에도 있고 자식클래스에도 동일한 메소드 가있으면 자식클래스가 우선권을 가짐
	public String information() {
		/*
		return  "브랜드명 : " + super.getBrand() + ", 상품번호 : " + super.getpCode() + ", 상품명 : " + 
		super.getpName() + ", 가격 : " + super.getPrice() + "원, 일체여부 : " + allInOne;
		*/
		
		return super.information() + " 일체여부 : " + allInOne;
	}
	
	
}
