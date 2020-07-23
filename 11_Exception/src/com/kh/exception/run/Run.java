package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.*;

public class Run {

	public static void main (String[] args) throws IOException {
		
		// 에러들의 종류
		// 예외란 뭔지
		// 예외처리를 왜 해야만 하는지
		// 예외처리 하는 방법
		
		// .java --> 컴파일 --> .class --> 실행
		
		/*
		 * 
		 *  * 에러 종류
		 *  - 시스템 에러 : 컴퓨터의 오작동으로 인한 오류 --> 소스코드로 해결 안됨 --> 심각한 에러
		 *  
		 *  - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 알려줌
		 *  - 런타임에러  : 코드 상으로 문제가 없는데 프로그램 실행시 발생하는 에러(사용자 실수, 개발자 예측가능한 경우)
		 *  ==> UnCheckedException 반드시 예외 처리를 해야만 하는 건 아니다.
		 *  
		 *  - 논리 에러 : 문법상으로도 문제가 없고, 실행했을 때도 문제가 되지 않지만 프로그램 의도상 맞지 않는것
		 *  
		 *  * 우리는 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리에러를 가지고 작업!
		 *  => 이런 것들을 "예외"라고 한다! == Exception
		 *  
		 *  * 이런 예외 "발생"했을 경우 "처리"하는 방법  == "예외 처리"
		 *  
		 *  * 예외처리를 안해놓으면, 예외 발생시 프로그램이 비 정상적으로 종료됨
		 *  
		 *  
		 */
		
		CheckedException ex = new CheckedException();
		
		ex.method1(); // 여기서 마저도 떠넘기면 JVM이 처리해줌ㅋ
		
		
		
		
		
		
	}
}
