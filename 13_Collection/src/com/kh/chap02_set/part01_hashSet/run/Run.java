package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		HashSet hs1 = new HashSet();
		
		
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(new Integer(1));
		//hs1.add(new Integer(1));
		
		
		System.out.println("hs1 : " + hs1);	// 순서유지x, 중복허용 x
		
		
		HashSet<Person> hs2 = new HashSet<Person>();
		
		hs2.add(new Person("공유", 40, 100));
		hs2.add(new Person("홍길동",26,40));
		hs2.add(new Person("김말똥",24,40));
		hs2.add(new Person("공유", 40, 100));
		
		System.out.println("hs2 : " + hs2); // 순서유지x, 중복허용?? (왜?? 동일 객체로 판단 되지 않았어!) => 주소값이 다르므로!
											// hashCode와 equals 메소드 오버라이딩 하게 되면 각 필드값들이 모두 일치할 경우 => 중복이 제거됨!
		
		/*
		 * 	* HashSet hs1 내부에서는
		 * 
		 *  1. "여러분.hashCode() == "반갑습니다".hashCode(); 비교
		 * 	2. + 여러분.equals 비교
		 * 
		 *  이렇게 비교한다.
		 *  
		 *  * HashSet hs2 내부에서는
		 *  
		 *  1. Person.hashCode() == Person.hashCode(); 비교
		 *  2. Person.equals 비교
		 */
		
		// Set계열 특징 상 index개념 없음!! => 즉, 특정 객체 하나만을 뽑을 순 없음!!
		
		// 단, 담겨 있는 객체들을 순차적으로 접근 가능해!
		
		// 1. for문 사용 가능! (단, 향상된 for문으로만 가능 index가 없으므로!)
		
		for(Person p : hs2 ) {
			//System.out.println(p);
			System.out.println(((Person)p).getName());
		}
		
		// 2. ArrayList에 담은 후 ArrayList 반복문 돌려가면서 접근하는 방법
		// List <--> Set 같은 부모를 공유하고 있으므로!
		
		//ArrayList list = new ArrayList();	// 빈리스트 생성
		
		//addAll의 클래스는 Collection 이므로 하위 클래스는 다 받을 수 있다!
		//list.addAll(hs2);	//addAll메소드로 통째로 추가
		
		
		ArrayList<Person> list = new ArrayList<Person>(hs2); // hs2에 담겨있는 객체를 리스트에 애초에 담으면서 생성하는 방법!
		
		System.out.println("======================");
		
		for(int i = 0; i<list.size(); i++) {
			//System.out.println(((Person)list.get(i)).getName());	//제네릭을 하지 않았기 때문에 Person의 변수를 불러올 수 없어요...
			System.out.println(list.get(i).getName());				//제네릭을 해주는게 번거로움을 해결 할 수 있다!! 강제형변환 따위....
			
		}
		
		// 3. Iterator 반복자를 이용하는 방법 (Stringtokenizer랑 약간 비슷할지도?)
		System.out.println("======================");
		
		// 1) hs2의 객체를 --> Iterator(반복자) 옮겨 담기	: set계열.iterator();
		Iterator<Person> it = hs2.iterator();	// hs2 => it	// iterator()에도 index 개념 없음!
		
		// 2) 반복문을 통해서 쏙쏙 뽑아내자!(아예 뽑아오는 것!)
		
		/*
		 * System.out.println(it.next());
		 * 
		 * System.out.println(it.next());
		 * 
		 * System.out.println("it 공간에 뽑을 게 더 있나?" + it.hasNext());
		 * 
		 * System.out.println(it.next());
		 */
		

			while(it.hasNext() == true) {
				
				//System.out.println(((Person)it.next()).getName());	// 역시 제네릭 설정안해서... 강제 형변환 번거로움...
				System.out.println(it.next().getName());
				
			}
		
		// HashSet 공간의 객체가 add될 때
		// 기존에 담겨있던 객체들과 "hashCode메소드, equals메소드"로 동일 객체인지 판단 할 수 있다.
			
			
	}

}
