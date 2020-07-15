package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book bk1 = new Book("수학의정석","나수학",10000);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 20000);
		
		// * toString()
		// 오버라이딩전 : Objcet 클래스의 toString() 실행했을때는 주소값...
		
		// 오버라이딩 후 : Book클래스(자식 클래스)에 재정의한 toString 메소드 실행  => 모든 필드값 하나의 문자열로 합쳐서 반환
		
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		//출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출 해줌
	}

}
