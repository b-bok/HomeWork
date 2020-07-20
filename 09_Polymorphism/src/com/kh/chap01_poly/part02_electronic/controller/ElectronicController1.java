package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

//1. 다형성 적용 안한 클래스
public class ElectronicController1 {

	
	// 용산 전자상가 가게(가정)
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	
	
	public void insert(Desktop d) {
		
		desk = d;
		
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	

	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selelctTablet() {
	
		return tab;
	}
	
	
	
	
	
	
}
