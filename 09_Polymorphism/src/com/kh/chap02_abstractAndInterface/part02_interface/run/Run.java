package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Person m = new Mother("강엄마",50,70,"출산");
		Person b = new Baby("김아기",3.5,70);
		
		System.out.println(m);
		System.out.println(b);
		
		//엄마와 아기가 밥을 먹는다.
		
		m.eat();	// 엄마 : 몸무게  +10, 건강도 - 10
		b.eat();	// 아기 : 몸무게 +3, 건강도 +1
		
	
		//엄마와 아기가 잠을 잔다.
		
		m.sleep(); // 엄마 : 건강도 + 10
		b.sleep(); // 아기 : 건강도 + 3
		
		System.out.println("====== 다음날  =====");
		System.out.println(m);
		System.out.println(b);
		
		
		
		
	}

}
