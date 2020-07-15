

package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Car c = new Car("��Ʋ��",12.5,"����",4);
		
		Airplane a = new Airplane("����",0.2,"��Ʈ��",4,2);
		
		Ship s = new Ship("���ù�",2.5,"�",1);
		
		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
	}

}
