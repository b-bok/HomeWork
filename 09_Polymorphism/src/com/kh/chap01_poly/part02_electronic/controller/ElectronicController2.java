package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

//2. 다형성 적용했을 때
public class ElectronicController2 {

	
	private Electronic[] elec = new Electronic[3];
	
	private int count = 0;
	
	public void insert(Electronic any) {
		
		// 부모타입을 매개변수로 해놓으면 자식 타입 모두 수용가능
		//Electronic any = new Desktop("삼성","데탑",1200000,"Geforce 1070");
		elec[count++] = any;
		
	}
	
	public Electronic select(int index) {
		
		return elec[index];
	}
	
	public Electronic[] select() {
		return elec;
	}
	
}
