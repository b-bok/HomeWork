package com.kh.chap02_set.part02_treeSet.run;

import java.util.*;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
	
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(new String("하하하"));
		ts1.add(new String("나나나"));
		ts1.add(new String("다다다"));
		ts1.add(new String("가가가"));
		ts1.add(new String("핳핳핳"));
		ts1.add(new String("나나나"));
		
		System.out.println(ts1); // 순서 유지 x, 중복 허용 x Wrapper클래스 다 CompareTo를 내장하고 있다!
		
		/*
		 *  TreeSet은 안에 CompareTo 내장!
		 *  가장 위에 있는 것과 비교
		 *  나나나 vs 하하하 비교후 => 작은 나나나는 왼쪽에 배치
		 * 	다다다 vs 1) 하하하 2) 나나나 보다 크므로 나나나의 오른쪽에 배치
		 * 	가가가 vs 1) 하하하 2) 나나나 보다 작으므로 나나나의 왼쪽에 배치
		 *  핳핳핳 vs 1) 하하하 보다 크므로 오른쪽에 배치
		 *  나나나 vs 나나나 CompareTo 비교후 일치해서 0을 반환하므로 중복으로 판단!
		 *  
		 *  이런식의 가지치는 구조 => 속도 가 빨라! => 모두 다 비교하는게 아니라서 검색, 탐색에 속도가 빠르다!
		 * 
		 */
		
		TreeSet ts2 = new TreeSet();
		
		ts2.add(new Person("공유",40,100));
		ts2.add(new Person("홍길동",24,40));
		ts2.add(new Person("김말똥",26,20));
		ts2.add(new Person("공유",20,60));
		
		System.out.println(ts2);
		//CompareTo Person클래스에서 이름 값으로만 비교해서 공유가 중복되지 않았던것!
		
		//TreeSet은 내부적으로 객체들이 추가될때, CompareTo메소드로 비교하면서 추가됨!!
		//CompareTo에 기술되어있는 정렬기준이 똑같은 경우, 다른 필드 값이 달라도 같다고 판단해버림!
		
		
		// 순차적으로 접근은 가능!!
		
		// 1. for each문
		
		for(Object o : ts2) {
			System.out.println(o);
		}
		
		System.out.println("=================");
		
		// 2. ArrayList에 담은 반복문
		
		ArrayList list = new ArrayList(ts2);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=================");
		// 3. Iterator 반복자에 담은 후 반복문
		
		Iterator it = ts2.iterator();
		
		
		while(it.hasNext() == true) {
			
			System.out.println(it.next());
		}
		
		
	}

}
