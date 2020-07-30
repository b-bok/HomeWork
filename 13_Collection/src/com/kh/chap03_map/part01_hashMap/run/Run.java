package com.kh.chap03_map.part01_hashMap.run;

import java.util.*;
import java.util.Map.Entry;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<String, Snack>();
		

		//새로운 객체를 추가하고자 할 때 key + 객체(value) 세트로 담아야함
		
		// K => key V => value
		
		// 1. put(K key, V value);
		hm.put("다이제", new Snack("초코맛",1500));
		hm.put("칸초", new Snack("단맛",700));
		hm.put("새우깡", new Snack("짠맛",500));
		hm.put("포테이토칩", new Snack("짠맛",500));
		
		
		System.out.println(hm); //저장 순서 유지 안됨!, value 값이 중복이되도, 키값이 중복되지 않으므로 잘담긴다.
		
		hm.put("새우깡", new Snack("매운맛",700)); // 키 값이 중복되면 마지막 value값으로 덮어씌워짐!!
		
		System.out.println(hm);
		
		// 2. get(K key) : V
		Snack s = /* (Snack) */ hm.get("다이제");
		System.out.println(s);
		
		
		
		// 3. size() : int
		System.out.println("갯수 : " + hm.size());
		
		
		
		// 4. replace(K key, V value) : key값을 찾아서 V로 교체한다! 
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000));
		
		// list.set(1, new Music()) 와 유사!
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("포테이토칩");
		
		System.out.println(hm);
		
		
		// hm 담겨 있는 모든 객체들에 순차적 접근 가능!
		
		// for each 문 
		
		//	Can only iterate over an array or an instance of java.lang.Iterable(즉, for문은 배열, set List Iterable 관련된것만!)
		/*
		 * for(Object o : hm) { --> 사용불가
		 * 
		 * }
		 */
		
		 //ArrayList list = new ArrayList(hm); => List는 map 담을 수 없어!
		
		
		
		// Iterator it = hm.iterator(); // 다이렉트로 호출은 불가능하다!
		// Map => Set => Iterator
		
		
		
		
		
		// Map => Set
		
		
		// 1. keySet() 이용하는 방법 ==> key값들만 뽑아서 key에 담는 것이다.
		//	1) hm.keySet() : Set
		
		Set<String> keySet = hm.keySet();
				
		//	2) keySet을 Iterator 반복자에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 	3) 반복문을 통해서 하나씩 뽑기
		while(itKey.hasNext()) {
			
			String key = /*(String)*/itKey.next();
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
			
		}
		
		
		System.out.println("===========================");
		
		
		// 2. entrySet() 이용하는 방법
		
		// 1) hm 키밸류 세트로 Set에 담기(키벨류 세트(Entry)의 집합 형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet의 Entry Iterator에 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 작업
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			
			System.out.println("entry : " + entry);
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
