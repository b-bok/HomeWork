package com.kh.chap02_string.controller;

import java.util.Arrays;

public class B_StringMethodTest {

	public void method() {
		
		String str1 = "Hell World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//		문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		
		char ch = str1.charAt(0);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//		문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 +"!!!";
		System.out.println("str3 : " + str3);
		
		//3. 문자열.toString() : String
		System.out.println("str1 : " + str1/* .toString() */);
		
		//4. 문자열.eqauls(Object obj) : boolean
		System.out.println(str1.equals(str2)); //false
		System.out.println(str2.equals(str3)); //true
		
		
		//5. 문자열.hashCode() : int
		System.out.println("str1의 해시코드" + str1.hashCode());
		System.out.println("str2의 해시코드" + str2.hashCode());
		System.out.println("str3의 해시코드" + str3.hashCode());
		
		// 6. 문자열.length() : int
		System.out.println("str1의 길이" + str1.length());
		System.out.println("str2의 길이" + str2.length());
		System.out.println("str3의 길이" + str3.length());
		
		
		// 7. 	문자열.substring(int beginIndex) : String
		//		문자열.substring(int beginIndex, int endIndex) : String
		// beginIndex 문자부터 문자열 끝까지 출력
		// beginIndex 문자부터 endIndex 문자까지만 출력
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,6));
		
		// 8. 	문자열.replace(char old, char new)
		//		문자열에서 old 문자를 new 문자로 변환한 문자열 리턴	
		String str4 = str1.replace('H', 'F');
		System.out.println(str4);
		
		
		// 9. 문자열.toUpperCase()/toLowerCase() : String
		//		해당 문자열 모두 대문자 /  모두 소문자 변경
		
		System.out.println("str1의 대문자로 바꾼다면 : " + str1.toUpperCase());
		System.out.println("str2의 소문자로 바꾼다면 : " + str2.toLowerCase());
		
		//System.out.print("continue?(y/n) : ");
		//char ch = sc.nextLine().toUpperCase().charAt(0); --> 메소드 체이닝
		// if문에서 소문자를 신경쓰지않아도된다. 왜냐면 무조건 대문자가 담기기 때문이다.
		//if(ch == 'Y') {
		//	
		//}
		
		
		//10. 문자열.trim() : String
		//		문자열의 앞 뒤 공백을 제거한 문자열 리턴
		
		String str6  = "                  JA              BA              ";
		
		System.out.println("trim : " + str6.trim());
		
		
		// 11. 문자열.toCharArray() : char[]
		//	      문자열의 각 문자들을 문자배열에 옮겨 담아 해당 배열의 주소값 리턴
		// String --> char[]
		String str7 = "Hello";
		char[] arr = str7.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		// 12. static valueOf(char[] data) : String
		//	char[] --> String
		
		System.out.println(String.valueOf(arr));
		

		
	
	}
}