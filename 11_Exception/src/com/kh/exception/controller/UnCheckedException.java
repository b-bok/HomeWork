package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {

	
	/*
	 *  * RuntimeException
	 * 	- 프로그램 실행시 발생되는 예외(문법적으로 문제되지 않음!!) --> 예외 처리가 필수가 아님
	 * 
	 *  * RuntimeException의 후손들
	 *  - NullPointerException : 레퍼런스변수가 null인 상태에서 메소드를 호출하는 경우
	 *  - ArrayIndexOutOfBOundException : 배열의 접근에 부적절한 인덱스 값 제시했을 경우
	 *  - ClassCastException : 허용할 수 없는 형변환 진행되는 경우
	 *  - ArithmeticException : 나누기 연산시 0으로 나눈 경우
	 *  - NegativeArraySizeException : 배열의 크기를 음수로 지정했을 경우
	 *  
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException : 나누기 연산시 0으로 나눈 경우
		
		// 사용자에게 두개 정수값 받고, 나눗셈 연산 결과 출력
		
	
			
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
					
			System.out.print("정수 2 (0 입력하지마세요) : ");		
			int num2 = sc.nextInt();
			
			
			
			/*
			 * 애초에 예외자체가 발생하지 안되게끔 조건 검사 ==> 예외 처리 아님
			int result = 0;
			
			if(num2 != 0) {
	
				result = num1 / num2;
			}
			
			System.out.println("결과 : " + result);
			System.out.println("프로그램 종료");
			 */
			
			// 예외 처리 : 예외가 발생했을 때 처리하는 구문을 미리 기술해두는 것
			/*
			 * *try catch 방법
			 * 		
			 * try {
			 * 
			 * 	예외가 발생될법한 구문;
			 * 	예외가 발생될법한 구문;
			 * 	예외가 발생될법한 구문;
			 * 
			 * }catch(발생될예외클래스명 변수명) { // 다중 캐치 가능
			 * 
			 * 		해당 예외가 발생되는 경우 처리할 구문;
			 * 
			 * }catch(발생될예외클래스명 변수명) {
			 * 
			 * 		해당 예외가 발생되는 경우 처리할 구문;
			 * 
			 * }catch(발생될예외클래스명 변수명) {
			 * 
			 * 		해당 예외가 발생되는 경우 처리할 구문;
			 * 
			 * }
			 * 
			 */
			
			int result = 0;
			
			try {
				result = num1/num2;
				
			}catch(ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			
			
			System.out.println("결과 : " + result);
			System.out.println("프로그램 종료");
	}
	
	
	
	public void method2() {
		
		
		// 애초에 예외자체가 발생 안되게끔 조건처리 가능
		
		/*
		
		if(size>0) {
			
			int[] arr = new int[size];
			System.out.println("0번 인덱스값 : " + arr[0]);
			
		}
		*/
		
		try {
			System.out.print("배열의 크기 입력 : ");
			int size = sc.nextInt();
			
			
			int[] arr = new int[size];
			System.out.println("0번 인덱스값 : " + arr[0]);
			
		//NegativeArraySizeException : 배열 크기지정을 음수로 했을 때	
				
		}catch(NegativeArraySizeException e) {
			
			System.out.println("양수 입력하시오!");
	
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("부적절한 인덱스요!");
			
		} catch(InputMismatchException e) {
			
			System.out.println("정수를 입력해주세요");
			
		} catch(RuntimeException e) { // 이것만으로 모든 예외를 처리할 수 있으나 명확한 답변 할 수없다!
									  // 한꺼번에 vs 자세하고 확실하게	
			System.out.println("예외 출몰!");
		}
		
		
		System.out.println("프로그램 종료");

	}
	
	
	// UnCheckedException은 예외 처리 해도 되고 안해도됨!
	// 예측 가능한 상황이고, if문으로 조건 처리가 가능 => 미리 핸들링 해주는게 권장 사항
	// 
	
}	
