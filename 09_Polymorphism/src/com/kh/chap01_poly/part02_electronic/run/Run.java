package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.*;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		/*
		Desktop d = new Desktop();
		NoteBook n = new NoteBook();
		Tablet t = new Tablet();
		
		//부모타입 = 자식객체
		Electronic[] arr = new Electronic[3];
		arr[0] = new Desktop("삼성","데탑",1200000,"Geforce 1070");
		arr[1] = new NoteBook("LG","그램",1800000,3);
		arr[2] = new Tablet("애플","아이패드프로",2000000,true);
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		// 납품 업체 (가정)
		
		//1. 다형성 적용 안했을 때 (ElectronicController1으로 실험)
		/*
		ElectronicController1 ec1 = new ElectronicController1();
		
		
		// 새로운 Desktop, NoteBook, Tablet 객체 전달
		
		ec1.insert(new Desktop("삼성","데탑",1200000,"Geforce 1070"));
		ec1.insert(new NoteBook("엘지","그램",1800000,3));
		ec1.insert(new Tablet("애플","아이패드프로",200000,true));
		
		
		// 가게에 있는 물건들의 정보를 조회
		
		Desktop d = ec1.selectDesktop();
		NoteBook n = ec1.selectNoteBook();
		Tablet t = ec1.selelctTablet();		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		//2. 다형성 적용 했을 때(ElectronicController2으로 실험)
		
		ElectronicController2 ec2 = new ElectronicController2();
		
		// Desktop,NoteBook,Tablet 객체 생성
		
		ec2.insert(new Desktop("삼성","데탑",1200000,"Geforce 1070"));
		ec2.insert(new NoteBook("엘지","그램",1800000,3));
		ec2.insert(new Tablet("애플","아이패드프로",200000,true));
		
		/*
		// 다운 캐스팅은 자동으로 되지 않으므로 강제 형변환 해줘야함
		Desktop d = (Desktop)ec2.select(0);
		// 간편하게 부모타입 그릇으로 담아도 됨
		Electronic n = ec2.select(1);
		Electronic t = ec2.select(2);
		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		
		Electronic[] elec = ec2.select();
		
		/* 향상된 for 문
		for(Electronic n : elec) {
			System.out.println(n);
		}
		*/
		
		for(int i =0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		
		/*
		 *	*다형성을 적용하는 이유
		 * 	1. 부모타입만으로 다양한 자식 객체 사용 가능(객체 배열)
		 * 	2. 매개변수 다형성을 적용하여 코드가 간편해짐
		 */
		
	}

}
