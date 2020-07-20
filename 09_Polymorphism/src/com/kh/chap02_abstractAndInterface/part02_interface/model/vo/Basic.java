package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Basic {
	
	// 추상클래스 --> 일반필드 + 일반메소드 + [추상 메소드]
	// 인터페이스 --> only 상수(public static final)필드 + 추상메소드

	
	// 인터페이스 에서 필드는 무조건 상수 필드라서 생략 가능
	// 상수 필드
	/*public static final*/ int NUM = 10; // 인터페이스 필드라서 생략 가능 그리고 상수인것은 변함 없음
	
	// 인터페이스 에서 메소든는 무조건 추상메소드라서 생략 가능
	// 추상메소드
	/*public abstract*/ void eat(); 	//인터페이스는 오직 추상메소드만 가능하다 --> 인터페이스라고 명시했기 때문에 생략가능
	/*public abstract*/ void sleep(); 	//인터페이스는 오직 추상메소드만 가능하다 --> 인터페이스라고 명시했기 때문에 생략가능
	
}
