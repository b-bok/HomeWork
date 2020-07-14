package com.kh.part01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.*;

public class ObjectTest{

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		Book bk2 = new Book("자바의정석","강보람",10000,"KH");
		Book bk3 = new Book();
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//사용자에게 값 입력받기
		Scanner sc = new Scanner(System.in);

		// 1. 전체 도서 정보 입력받기
		for(int i = 0; i<3; i++) {
			
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("제목  : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 :");
			String publisher = sc.nextLine();
			
			// 조건처리 일일히 해줘야하는 불편함...
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
				
			
		}
		
		// 2. 전체 도서 정보 출력
		// 반복문도 사용불가하더라...
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 3. 도서 제목 검색하기
		System.out.print("검색할 책 제목 입력해 주세요 : ");
		String search = sc.nextLine();
		
			if(search.equals(bk1.getTitle())) {
				System.out.println(bk1.information());
				
			}
			if (search.equals(bk2.getTitle())) {
				System.out.println(bk2.information());
				
			}
			
			if (search.equals(bk3.getTitle())) {
				System.out.println(bk3.information());
				
			} else {
				System.out.println("찾으시는 책은 없습니다.");
			}
		
		
		
		
		
	}

}
