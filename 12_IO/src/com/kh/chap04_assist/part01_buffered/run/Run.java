package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.*;

public class Run {

	public static void main(String[] args) {

		
		/*
		 * 
		 *  * 보조스트림 :  보조역할만 수행(즉, 기반스트림만으로 부족한 기능 제공)
		 * 				 속도 향상, 개체단위로 입출력, 추가적 메소드 제공
		 * 
		 * 	> 단독 사용 불가, 기반 스트림 반드시 함께
		 * 
		 * 
		 */
		
		BufferedTest bt = new BufferedTest();
		
		bt.fileRead();
	}

}
