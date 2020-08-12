package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		HashSet hs1 = new HashSet();
		
		
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		//hs1.add(new Integer(1));
		//hs1.add(new Integer(1));
		
		
		System.out.println("hs1 : " + hs1);	// ��������x, �ߺ���� x
		
		
		HashSet<Person> hs2 = new HashSet<Person>();
		
		hs2.add(new Person("����", 40, 100));
		hs2.add(new Person("ȫ�浿",26,40));
		hs2.add(new Person("�踻��",24,40));
		hs2.add(new Person("����", 40, 100));
		
		System.out.println("hs2 : " + hs2); // ��������x, �ߺ����?? (��?? ���� ��ü�� �Ǵ� ���� �ʾҾ�!) => �ּҰ��� �ٸ��Ƿ�!
											// hashCode�� equals �޼ҵ� �������̵� �ϰ� �Ǹ� �� �ʵ尪���� ��� ��ġ�� ��� => �ߺ��� ���ŵ�!
		
		/*
		 * 	* HashSet hs1 ���ο�����
		 * 
		 *  1. "������.hashCode() == "�ݰ����ϴ�".hashCode(); ��
		 * 	2. + ������.equals ��
		 * 
		 *  �̷��� ���Ѵ�.
		 *  
		 *  * HashSet hs2 ���ο�����
		 *  
		 *  1. Person.hashCode() == Person.hashCode(); ��
		 *  2. Person.equals ��
		 */
		
		// Set�迭 Ư¡ �� index���� ����!! => ��, Ư�� ��ü �ϳ����� ���� �� ����!!
		
		// ��, ��� �ִ� ��ü���� ���������� ���� ������!
		
		// 1. for�� ��� ����! (��, ���� for�����θ� ���� index�� �����Ƿ�!)
		
		for(Person p : hs2 ) {
			//System.out.println(p);
			System.out.println(((Person)p).getName());
		}
		
		// 2. ArrayList�� ���� �� ArrayList �ݺ��� �������鼭 �����ϴ� ���
		// List <--> Set ���� �θ� �����ϰ� �����Ƿ�!
		
		//ArrayList list = new ArrayList();	// �󸮽�Ʈ ����
		
		//addAll�� Ŭ������ Collection �̹Ƿ� ���� Ŭ������ �� ���� �� �ִ�!
		//list.addAll(hs2);	//addAll�޼ҵ�� ��°�� �߰�
		
		
		ArrayList<Person> list = new ArrayList<Person>(hs2); // hs2�� ����ִ� ��ü�� ����Ʈ�� ���ʿ� �����鼭 �����ϴ� ���!
		
		System.out.println("======================");
		
		for(int i = 0; i<list.size(); i++) {
			//System.out.println(((Person)list.get(i)).getName());	//���׸��� ���� �ʾұ� ������ Person�� ������ �ҷ��� �� �����...
			System.out.println(list.get(i).getName());				//���׸��� ���ִ°� ���ŷο��� �ذ� �� �� �ִ�!! ��������ȯ ����....
			
		}
		
		// 3. Iterator �ݺ��ڸ� �̿��ϴ� ��� (Stringtokenizer�� �ణ ���������?)
		System.out.println("======================");
		
		// 1) hs2�� ��ü�� --> Iterator(�ݺ���) �Ű� ���	: set�迭.iterator();
		Iterator<Person> it = hs2.iterator();	// hs2 => it	// iterator()���� index ���� ����!
		
		// 2) �ݺ����� ���ؼ� ��� �̾Ƴ���!(�ƿ� �̾ƿ��� ��!)
		
		/*
		 * System.out.println(it.next());
		 * 
		 * System.out.println(it.next());
		 * 
		 * System.out.println("it ������ ���� �� �� �ֳ�?" + it.hasNext());
		 * 
		 * System.out.println(it.next());
		 */
		

			while(it.hasNext() == true) {
				
				//System.out.println(((Person)it.next()).getName());	// ���� ���׸� �������ؼ�... ���� ����ȯ ���ŷο�...
				System.out.println(it.next().getName());
				
			}
		
		// HashSet ������ ��ü�� add�� ��
		// ������ ����ִ� ��ü��� "hashCode�޼ҵ�, equals�޼ҵ�"�� ���� ��ü���� �Ǵ� �� �� �ִ�.
			
			
	}

}
