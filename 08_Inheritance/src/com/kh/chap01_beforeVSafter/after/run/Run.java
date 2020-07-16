package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//객체 생성
		Desktop d = new Desktop("삼성","d-01","짱짱데스크",1500000,true);
		
		//객체 생성
		Tv t = new Tv("LG","t-01","겁나얇은티비",3500000,60);
		
		//객체 생성
		SmartPhone s = new SmartPhone("애플","s-01","아이폰11pro",1500000,"KT");
		
		// 다형성 한번 알아보기!!
		Product p1 = new Desktop();
		Product p2 = new Tv();
		Product p3 = new SmartPhone();
		
		Product[] arr = new Product[3];
		arr[1] = new Desktop();
		arr[2] = new Tv();
		arr[3] = new SmartPhone();
		
	
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 생성 가능
		 * - 코드를 공통적 관리하므로, 새로운 코드 추가 및 보수가 용이하다.
		 * --> 중복코드 제거를 통한 생산성 향상
		 * 
		 * * 상속의 특징
		 * - 클래스간 상속은 단일 상속만 가능(다중상속 불가)
		 * - 부모의 Private 접근제한자로 기술되어있는 경우는 상속구조라해도 직접접근 불가
		 * 		(단, Protected로 하게 되면 자식에서 직접 접근 가능)
		 * - 명시되어있지 않지만 모든 클래스는 objcet 클래스의 후손이다!
		 * --> Object클래스가 제공하는 메소드는 얼마든지 사용가능하다!
		 * --> 맘에 안들면 입맛대로 재정의(오버라이딩) 가능
		 * 
		 * 
		 */
		
	}

}
