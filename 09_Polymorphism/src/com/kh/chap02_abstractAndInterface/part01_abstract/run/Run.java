package com.kh.chap02_abstractAndInterface.part01_abstract.run;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.*;
public class Run {

	public static void main(String[] args) {

		/*
		 * 
		 *  * 추상클래스
		 *  - 미완성 클래스 와 동일한 의미
		 *  - 객체 생성 불가!!(단, 레퍼런스타입으로 기술 가능 == 자식객체로 생성은 가능하다!)
		 *  - 일반 필드 + 일반 메소드 + [추상 메소드(추상메소드가 없어도 추상 클래스 만들 수 있음) --> 아직 미완성 클래스니까 객체 생성은 좀..의 의미]  
		 *  	--> 추상 메소드를 가진 클래스는 반드시 추상 클래스로 명시해야함!
		 * 			언제? --> 클래스 정의하긴했지만, 객체생성 못하게 만들고 싶을 때도 사용가능!
		 * 
		 * 	* 추상메소드
		 * 	- 미완성된 메소드, 몸통부{}가 구현되지 않는 메소드!
		 * 	- 추상메소드가 기술된 추상클래스를 상속받는 자식 클래스에서 반드시 오버라이딩 필수!
		 * 		--> 오버라이딩 하지않으면 에러 발생
		 * 		--> 메소드 사용의 통일성을 확보 목적으로
		 */
		
		
		
		//추상클래스(미완성된 클래스로 객체 생성 불가)
		//Sport s = new Sport();
		
		
		//단, 레퍼런스 타입으로는 기술 가능
		// 다형성으로 적용가능
		
		Sport[] arr = new Sport[2];
		
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(Sport n : arr) {
			n.rule();
		}
		
		
		
	}

}
