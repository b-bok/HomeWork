package com.kh.chap02_string.controller;

import java.util.Arrays;

public class B_StringMethodTest {

	public void method() {
		
		String str1 = "Hell World";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		//		���ڿ����� ���޹��� index ��ġ�� ���ڸ��� �����ؼ� ����
		
		char ch = str1.charAt(0);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String
		//		���ڿ��� ���޵� �Ǵٸ� ���ڿ��� �ϳ��� ���ļ� ���ο� ���ڿ��� ����
		
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 +"!!!";
		System.out.println("str3 : " + str3);
		
		//3. ���ڿ�.toString() : String
		System.out.println("str1 : " + str1/* .toString() */);
		
		//4. ���ڿ�.eqauls(Object obj) : boolean
		System.out.println(str1.equals(str2)); //false
		System.out.println(str2.equals(str3)); //true
		
		
		//5. ���ڿ�.hashCode() : int
		System.out.println("str1�� �ؽ��ڵ�" + str1.hashCode());
		System.out.println("str2�� �ؽ��ڵ�" + str2.hashCode());
		System.out.println("str3�� �ؽ��ڵ�" + str3.hashCode());
		
		// 6. ���ڿ�.length() : int
		System.out.println("str1�� ����" + str1.length());
		System.out.println("str2�� ����" + str2.length());
		System.out.println("str3�� ����" + str3.length());
		
		
		// 7. 	���ڿ�.substring(int beginIndex) : String
		//		���ڿ�.substring(int beginIndex, int endIndex) : String
		// beginIndex ���ں��� ���ڿ� ������ ���
		// beginIndex ���ں��� endIndex ���ڱ����� ���
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,6));
		
		// 8. 	���ڿ�.replace(char old, char new)
		//		���ڿ����� old ���ڸ� new ���ڷ� ��ȯ�� ���ڿ� ����	
		String str4 = str1.replace('H', 'F');
		System.out.println(str4);
		
		
		// 9. ���ڿ�.toUpperCase()/toLowerCase() : String
		//		�ش� ���ڿ� ��� �빮�� /  ��� �ҹ��� ����
		
		System.out.println("str1�� �빮�ڷ� �ٲ۴ٸ� : " + str1.toUpperCase());
		System.out.println("str2�� �ҹ��ڷ� �ٲ۴ٸ� : " + str2.toLowerCase());
		
		//System.out.print("continue?(y/n) : ");
		//char ch = sc.nextLine().toUpperCase().charAt(0); --> �޼ҵ� ü�̴�
		// if������ �ҹ��ڸ� �Ű澲���ʾƵ��ȴ�. �ֳĸ� ������ �빮�ڰ� ���� �����̴�.
		//if(ch == 'Y') {
		//	
		//}
		
		
		//10. ���ڿ�.trim() : String
		//		���ڿ��� �� �� ������ ������ ���ڿ� ����
		
		String str6  = "                  JA              BA              ";
		
		System.out.println("trim : " + str6.trim());
		
		
		// 11. ���ڿ�.toCharArray() : char[]
		//	      ���ڿ��� �� ���ڵ��� ���ڹ迭�� �Ű� ��� �ش� �迭�� �ּҰ� ����
		// String --> char[]
		String str7 = "Hello";
		char[] arr = str7.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		// 12. static valueOf(char[] data) : String
		//	char[] --> String
		
		System.out.println(String.valueOf(arr));
		

		
	
	}
}