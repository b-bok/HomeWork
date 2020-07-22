package com.kh.chap02_string.controller;

public class D_BuilderBufferTest {

	/*
	 *  *String Ŭ���� == �Һ�Ŭ����(���ڸ����� ���� ����Ǵ°� �ƴ� ����)
	 *  --> ����� ���� ������ ��� �������÷���(GC)�� ��� ������ ������ ������ߵǴ� ����
	 *  --> ������ ���� �б⸸ �� ��� String Ŭ������ ����
	 *  
	 *  * StringBuilder, StringBuffer == ����Ŭ����(�� �ڸ����� ���� ����Ǵ� ����)
	 *  	- StringBuilder, StringBuffer ��� �����ڳ� �����ϰ� �ִ� �޼ҵ� ����!!
	 *  	- ������ �������� ����ȭ�� �ǳ� �ȵǳ��� ���� --> ��, �ӵ� ����
	 *  
	 *  >StringBuilder = ����ȭ ���� x
	 *  >StringBuffer  = ����ȭ ���� o
	 *  
	 *  
	 *  ������ : �ϳ��� ���� ����
	 *  
	 *  ���� ������ : ���� ������ �ϳ�, ���������� ����
	 *  ��Ƽ ������ ȯ�� : �������� ��ó���� �����ؼ� ���ôٹ��� ����
	 *  
	 *  ����ȭ�� �����Ѵ�  => ������ ���� �� �ִ� => StringBuffer�� ����ȭ ����=> ����ȭ�� �ӵ����ϸ� ����
	 *  ���Ͻ������� ��쿡�� ����ȭ �������� �ʴ� StringBuilder ���	
	 */
	
	public void method1() {
		// StringBuilder, StringBuffer ��ü ������ ó���� 16���� ���ڸ� ������ �� �ִ� ���۰� ���������� ����
		
		//1. �⺻ �����ڷ� ����
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println("sb1�� ���뷮 : " + sb1.capacity());
		System.out.println("sb1�� ���ڿ��� ���� : " + sb1.length());
		
		System.out.println("========================");
		
		
		//2. ���� �� ���ް����� �Ű����� ������ ���� 		--> ������ ������ ũ�⸸ŭ ���뷮�� ������
		StringBuilder sb2 = new StringBuilder(30);
		
		System.out.println("sb2�� ���뷮 : " + sb2.capacity());
		System.out.println("sb2�� ���ڿ��� ���� : " + sb2.length());
		
		
		System.out.println("========================");
		
		//3. ���ڿ� ���ް����� �Ű����� �����ڷ� ����
		
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		
		System.out.println("Sb3�� ���뷮 : " + sb3.capacity()); // 16(�⺻) + 5(���ڿ� ����) = 21(���뷮)
		System.out.println("sb3�� ���ڿ��� ���� : " + sb3.length());
		
		
		
	}
	
	public void method2() {
		//불변인지 가변인지
		
		//String 클래스 가지고 불변
		String str = "반가워!!";
		System.out.println(System.identityHashCode(str));
		
		
		str += "난 String이얌"; // str = str + "난 String이얌";  주소값 유지 되는 것 아님
							  // str = "반가워!!난String이얌";	기존 연결은 끊기고, 새로운 연결
		
		System.out.println(System.identityHashCode(str));
		
		System.out.println("========================");
		
		// StringBuilder 가변
		StringBuilder sb = new StringBuilder("반가워!");
		
		System.out.println("sb : " + sb);
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " +sb.capacity()); // 16+ 4
		System.out.println("문자열의 길이 : "  + sb.length());
		
		System.out.println("========================");
		
		//StringBuilder 담긴 문자열을 변경하고자 한다면 메소드를 통해서 작업
		
		//1. append(String str) : StringBuilder		--> 기존의 문자열에 새로운 문자열 추가
		
		sb.append("안녕!");
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); // 16+ 4
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
		// 주소값 변동 없음 ==> 그 자리에서 문자열 변경 ==> 가변!
		
		System.out.println("========================");
		
		sb.append("다들 조금만 힘내세요!!!"); //14글자
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); // 기존의 수용량  * 2 + 2 만큼 늘어남
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
		
		System.out.println("========================");
		
		
		//2. delete(int start, int end) : StringBuilder				--> 기존의 문자열 삭제(star<end)
		
		sb.delete(2, 5);
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); // 문자열 삭제해도 변경 없음
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
		
		System.out.println("========================");
		
		// 3. insert(int offset, String str) : StringBuilder			--> 기존의 문자열 사이에 또다른 문자열 추가하기
		
		sb.insert(1, "ㅎㅎㅎ");
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); 
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
		
		System.out.println("========================");
		
		// 4. reverse()  : StringBuilder		--> 기존의 문자열을 역으로 바꾸고자 할 때
		sb.reverse();
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); 
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
		
		System.out.println("========================");
		
		sb.append("ㅋㅋㅋ").delete(0, 4).reverse().insert(2, "ㄱㄱㄱ");
		// 각각의 메소드가 StringBuilder 객체를 반환하므로 연이어 가능하다.

		System.out.println("변경 후 sb : " + sb);
		System.out.println("변경 후 sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경 후 수용량 : " +sb.capacity()); 
		System.out.println("변경 후 문자열의 길이 : "  + sb.length());
	}
	
	
	public void method3() {
		
		StringBuilder sb = new StringBuilder("javaProgram");
		
		sb.append("API").delete(4,11).reverse();
		//javaProgramAPI
		//				javaAPI
		//						IPAavaj
		
		
		
		System.out.println("변경 후 sb : " + sb);

	}
	
}
