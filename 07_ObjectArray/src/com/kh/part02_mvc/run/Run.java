package com.kh.part02_mvc.run;

import com.kh.part02_mvc.view.PersonView;

public class Run {

	public static void main(String[] args) {
		
		// Run :  프로그램 실행만 시켜주는 역할
		// 		== 사용자가 보게될 첫 메인 화면 띄워줌
		
		PersonView pv = new PersonView();
		pv.mainMenu(); //선호출 후 만들기
		
		
	}

}
