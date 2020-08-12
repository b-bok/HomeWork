package com.kh.chap03_map.part01_hashMap.run;

import java.util.*;
import java.util.Map.Entry;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<String, Snack>();
		

		//���ο� ��ü�� �߰��ϰ��� �� �� key + ��ü(value) ��Ʈ�� ��ƾ���
		
		// K => key V => value
		
		// 1. put(K key, V value);
		hm.put("������", new Snack("���ڸ�",1500));
		hm.put("ĭ��", new Snack("�ܸ�",700));
		hm.put("�����", new Snack("§��",500));
		hm.put("��������Ĩ", new Snack("§��",500));
		
		
		System.out.println(hm); //���� ���� ���� �ȵ�!, value ���� �ߺ��̵ǵ�, Ű���� �ߺ����� �����Ƿ� �ߴ���.
		
		hm.put("�����", new Snack("�ſ��",700)); // Ű ���� �ߺ��Ǹ� ������ value������ �������!!
		
		System.out.println(hm);
		
		// 2. get(K key) : V
		Snack s = /* (Snack) */ hm.get("������");
		System.out.println(s);
		
		
		
		// 3. size() : int
		System.out.println("���� : " + hm.size());
		
		
		
		// 4. replace(K key, V value) : key���� ã�Ƽ� V�� ��ü�Ѵ�! 
		hm.replace("��������Ĩ", new Snack("�̳� §��", 1000));
		
		// list.set(1, new Music()) �� ����!
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("��������Ĩ");
		
		System.out.println(hm);
		
		
		// hm ��� �ִ� ��� ��ü�鿡 ������ ���� ����!
		
		// for each �� 
		
		//	Can only iterate over an array or an instance of java.lang.Iterable(��, for���� �迭, set List Iterable ���õȰ͸�!)
		/*
		 * for(Object o : hm) { --> ���Ұ�
		 * 
		 * }
		 */
		
		 //ArrayList list = new ArrayList(hm); => List�� map ���� �� ����!
		
		
		
		// Iterator it = hm.iterator(); // ���̷�Ʈ�� ȣ���� �Ұ����ϴ�!
		// Map => Set => Iterator
		
		
		
		
		
		// Map => Set
		
		
		// 1. keySet() �̿��ϴ� ��� ==> key���鸸 �̾Ƽ� key�� ��� ���̴�.
		//	1) hm.keySet() : Set
		
		Set<String> keySet = hm.keySet();
				
		//	2) keySet�� Iterator �ݺ��ڿ� ���
		Iterator<String> itKey = keySet.iterator();
		
		// 	3) �ݺ����� ���ؼ� �ϳ��� �̱�
		while(itKey.hasNext()) {
			
			String key = /*(String)*/itKey.next();
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
			
		}
		
		
		System.out.println("===========================");
		
		
		// 2. entrySet() �̿��ϴ� ���
		
		// 1) hm Ű��� ��Ʈ�� Set�� ���(Ű���� ��Ʈ(Entry)�� ���� ����)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet�� Entry Iterator�� ���
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� ���� �۾�
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
