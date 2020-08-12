package com.kh.chap01_list.part01_basic.run;

import java.util.*;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 * * 컬렉션이란?
		 * - 컬렉션이란 자료구조가 내장되어있는 클래스, 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
		 * 
		 * * 자료구조?
		 * - 방대한 데이터를 효율적(구조적)으로 다룰때 필요한 개념!
		 * 
		 * * 프레임워크?
		 * - 자바에서 이미 제공되고 있는 틀, 편리하게 가져가 쓸수 있음!
		 * 
		 * 
		 * * 배열의 특징 (단점)
		 * 	1. 배열을 사용하기 위해서는 반드시 크기 지정을 해야만 한다!
		 * 		=> 한번 지정된 크기 변경 불가!
		 * 		=> 배열의 크기를 너무 크게 잡아도, 메모리 낭비!
		 * 
		 * 	2. 배열의 중간 위치에 데이터 삽입 및 삭제 경우 직접 코드로 작업을 알고리즘으로 구현하는 복잡함!(비효율적)		
		 * 		
		 * 	3. 한 타입의 데이터만 저장가능한 단점!(int[] -> int 값만  double[] -> double 값만 Person[] -> Person 객체만!)
		 * 
		 *  
		 *  
		 * * 배열의 단점을 보완한 개념? ==> 컬렉션! 컬렉션의 장점?
		 *   1. 크기에 대한 제약이 없음(크기 지정할 필요 없음,알아서 크기 증가!)
		 *   
		 *   2. 중간에 값을 추가한다거나, 삭제하는 경우에 값을 땡겨주는 작업을 직접 구현할 필요 없음!
		 *   	이미 메소드로 정의해서 제공해주고 있음!(즉, 메소드 호출만 잘 해주면 됨!)
		 *   
		 * 	 3. 여러타입의 데이터를 저장 할 수 있음!(단, 객체만 저장 가능!)
		 * 		
		 * 	
		 * * 방대한 데이터를 관리할 때 삭제나 추가, 수정, 정렬 등의 기능들을 많이 할 경우 컬렉션을 사용하는게 좋다!
		 * 	  값을 보관, 조회하는 수준에 그친다면 배열을 사용하는게 좋다!
		 * 
		 *  	
		 *  
		 * 					|		List		|		Set			|		 Map			|
		 *  =================================================================================
		 * 	    담을 수 있는 데이터	|		저장하고자 하는 데이터 만 저장(value)		|저장할 데이터(value) + key값	|
		 * ----------------------------------------------------------------------------------
		 * 	  	순서 유지		| O	(index개념)		|	무작위로 담김		|	무작위로 담김 + (key값 => index 역할)
		 * ----------------------------------------------------------------------------------
		 *  	중복 허용		|		O			|  중복값 허용 안함		| 중복값 허용 안함(key값 중복허용 불가, value는 중복 가능)
		 * ------------------------------------------------------------------------------------------------------ 
		 *  
		 *  * List의 후손 클래스
		 *  - "ArrayList", Vector, LinkedList
		 *  
		 *  - Vector와 ArrayList 동일한 기능 제공
		 *  	차이점 : Vector : 동기화 제공 O(멀티 쓰레드 환경에서 데이터 안정성 측면에서 좋지만, 단일쓰레드에서는 속도 저하 유발)
		 *  		   ArrayList : 동기화 제공 X
		 * 
		 * - ArrayList 와 LinkedList의 차이점
		 * 	> ArrayList는 내부적으로 배열이 베이스
		 * 	   특정 인덱스 값 추가, 삭제할 때 내부적으로 반복문 수행되며 값이 당겨짐
		 * 
		 * 	> LinkedList는 데이터와 데이터가 체인처럼 연결되어 관리
		 * 	   특정 인덱스 값 추가, 삭제할 때 작업하는 인덱스 앞과 뒤를 연결 또는 해지 해주면 끝!
		 * 
		 *  새로운 데이터 추가, 삭제는 LinkedList가 더 빠름! 단, 검색 속도는 느림(전체 탐색하므로)
		 *  
		 */
		
	
		// ArrayList 컬렉션 사용하기
		
		ArrayList<Music> list = new ArrayList<Music>(3); // 크기 지정 할 수 도 있고, 하지 않아도 10으로 배정
														 // 제너릭<>을 설정해주면, 6번 경우에 따로 강제 형변환을 해주지 않아도된다!	
		System.out.println(list);
		
		//E --> Element : 리스트에 담길 요소들 (객체라고 생각하면됨)
		
		//1. add(E e) : 리스트 끝에 전달된 객체를 추가해주는 메소드
		
		list.add(new Music("Good Bye","박효신"));
		list.add(new Music("이 밤","양다일"));
		list.add(new Music("잊혀지다","정키"));
		//list.add("끝");
		
		// 지정한 크기 보다 크게 넣어도 오류 발생x	--> 장점 1 : 크기의 제악 없음
		// 다양한 타입의 데이터가 들어가도 문제 없음	--> 장점 3 : 여러타입 보관 가능
		
		
		System.out.println(list);	// 순서유지 되고 있음!
		
		// 2. add(int index, E e) : 해당 인덱스에 내가 전달한 객체를 추가시켜주는 메소드
		
		list.add(1, new Music("진심이 담긴 노래","케이시"));
		
		System.out.println(list);	
		
		// 3. set(int index, E e) : 해당 인덱스의 값을 새로 입력한 객체로 변경	
		
		list.set(0, new Music("술이 달다","에픽하이"));
		
		System.out.println(list);
		
		// 4. size(); : 리스트 안에 몇개의 객체가 담겨있는지 갯수반환 메소드	**
		
		System.out.println("몇개의 객체가 ? : " + list.size());
		
		// 5. remove(int index) : 해당 인덱스 객체 삭제 메소드(크기 알아서 줄어듬, 객체도 알아서 당겨짐)
		list.remove(1);
		
		System.out.println(list);
		System.out.println("몇개의 객체가 ? : " + list.size());
		
		// 6. get(int index) : E ==> 해당 인덱스 객체 반환 시켜주는 메소드	**
		
		Music m = /*(Music)*/list.get(0);		// 객체 배열의 list[0]과 같은 개념 //다운캐스팅은 자동으로 되지 않으므로 강제 형변환 해주는 것 (Object -> Music)
									// ArrayList 제너릭을 <Music>으로 설정했기 때문에 강제 형변환 할 필요 없음
		
		//String str = (String) list.get(3);
		
		System.out.println(m);
		//System.out.println(str);
		
		
		// 7. subList(int index1, int index2) : indext1부터 index2까지의 해당 객체를 추출해서 새로운 List로 반환시켜주는 메소드
		List<Music> sub = list.subList(0,2);	// 0<= x <2의 개념 
		
		System.out.println(sub);	
		
		// 8. addAll(Collection c) : 컬렉션에 담겨있는 모든 객체들을 통째로 추가해주는 메소드(Map은 제외)
		list.addAll(sub);
		
		System.out.println(list);
		
		System.out.println("==========================");
		
		
		// 9. isEmpty() : 컬렉션 비어있는지 물어보는 메소드(비어있으면 true, 아니면 false)	**
		System.out.println("list가 비어있나요? : " + (list.isEmpty() ? "비어있소" : "차있소"));
		
		
		
		// 10. clear() : 컬렉션에 담긴 객체 싹 비움
		//list.clear();
		System.out.println(list);
		
		//System.out.println("list가 비어있나요? : " + (list.isEmpty()? "비어있소" : "차있소"));
		
		
		
		// 해당 리스트에 담겨있는 모든 객체들에 순차적으로 접근해서 출력
		System.out.println("==========================");
		
		
		
		//0번 인덱스부터 마지막 인덱스(list.size() -1)까지
		
		//for loop문
		/*
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		
		//for each문
		for(Music i : list) { // list는 반환시 Object로 반환되기 때문에! --> <Music>으로 제너릭 한 경우 Music 타입으로 명시 가능 ( Object i -> Music i)
			System.out.println(i);
		}
		
		/*
		 * 
		 *  * <> 제네릭스 사용 이유
		 *  1. 제네릭으로 설정한 타입 객체만 담을 수 있도록 제한을 두기 위해서!
		 *  2. 해당 컬렉션에 저장된 객체를 꺼낼 때도, 매번 형변환 할 필요 없음!
		 *  
		 */
		
	}

}
