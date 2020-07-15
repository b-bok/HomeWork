package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

	private int inch;
	
	
	
	
	public Tv( ) {}

	public Tv(String brand, String pName, String pCode, int price, int inch) {
		super(brand, pName, pCode, price);
		this.inch = inch;
	}
	
	
	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		
			return  super.information() + " ÀÎÄ¡ : " + inch;
	} 
	
}
