package com.kh.part01_objectVSobjectArray.run;
import com.kh.part01_objectVSobjectArray.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
		Product[] arr = new Product[3];
		
		//System.out.println(arr[0].getName()); java.lang.NullPointerException : null.~ 으로 접근했을 때 발생
		
		
		// 각 인덱스별로 객체 생성하기
		arr[0] = new Product("은하수","샘송",1300000);
		arr[1] = new Product("아이폰 ","사과",1500000);
		arr[2] = new Product();
		
		// for loop문
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		
		arr[2].setName("벨벳");
		arr[2].setBrand("엘지");
		arr[2].setPrice(8000000);
		
		System.out.println("======== 변경 후 =========");
		
		// for each문(향상된 for문)
		
		int [] num = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		// for(접급했을 때 값을 보관할 변수 : 순차적으로 접근하고자하는 배열명)
		for(int n : num) { 	// int n = num[0];
							// int n = num[1];
							// int n = num[2];
			System.out.println(n + " ");
		}
		
		
		for(Product p : arr) {
			// Product p = arr[0];
			// Product p = arr[1];
			// product p = arr[2];
			System.out.println(p.information());
		}
		
		
	}

}
