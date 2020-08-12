package com.kh.chap02_set.part02_treeSet.run;

import java.util.*;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
	
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(new String("������"));
		ts1.add(new String("������"));
		ts1.add(new String("�ٴٴ�"));
		ts1.add(new String("������"));
		ts1.add(new String("�K�K�K"));
		ts1.add(new String("������"));
		
		System.out.println(ts1); // ���� ���� x, �ߺ� ��� x WrapperŬ���� �� CompareTo�� �����ϰ� �ִ�!
		
		/*
		 *  TreeSet�� �ȿ� CompareTo ����!
		 *  ���� ���� �ִ� �Ͱ� ��
		 *  ������ vs ������ ���� => ���� �������� ���ʿ� ��ġ
		 * 	�ٴٴ� vs 1) ������ 2) ������ ���� ũ�Ƿ� �������� �����ʿ� ��ġ
		 * 	������ vs 1) ������ 2) ������ ���� �����Ƿ� �������� ���ʿ� ��ġ
		 *  �K�K�K vs 1) ������ ���� ũ�Ƿ� �����ʿ� ��ġ
		 *  ������ vs ������ CompareTo ���� ��ġ�ؼ� 0�� ��ȯ�ϹǷ� �ߺ����� �Ǵ�!
		 *  
		 *  �̷����� ����ġ�� ���� => �ӵ� �� ����! => ��� �� ���ϴ°� �ƴ϶� �˻�, Ž���� �ӵ��� ������!
		 * 
		 */
		
		TreeSet ts2 = new TreeSet();
		
		ts2.add(new Person("����",40,100));
		ts2.add(new Person("ȫ�浿",24,40));
		ts2.add(new Person("�踻��",26,20));
		ts2.add(new Person("����",20,60));
		
		System.out.println(ts2);
		//CompareTo PersonŬ�������� �̸� �����θ� ���ؼ� ������ �ߺ����� �ʾҴ���!
		
		//TreeSet�� ���������� ��ü���� �߰��ɶ�, CompareTo�޼ҵ�� ���ϸ鼭 �߰���!!
		//CompareTo�� ����Ǿ��ִ� ���ı����� �Ȱ��� ���, �ٸ� �ʵ� ���� �޶� ���ٰ� �Ǵ��ع���!
		
		
		// ���������� ������ ����!!
		
		// 1. for each��
		
		for(Object o : ts2) {
			System.out.println(o);
		}
		
		System.out.println("=================");
		
		// 2. ArrayList�� ���� �ݺ���
		
		ArrayList list = new ArrayList(ts2);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=================");
		// 3. Iterator �ݺ��ڿ� ���� �� �ݺ���
		
		Iterator it = ts2.iterator();
		
		
		while(it.hasNext() == true) {
			
			System.out.println(it.next());
		}
		
		
	}

}
