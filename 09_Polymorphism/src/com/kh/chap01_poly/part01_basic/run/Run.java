package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ���� '=' ������		 ���ʰ� �������� �׻� ���� �ڷ���(Ÿ��)
		
		
		// 1. �θ�Ÿ�� ���۷����� �θ�Ÿ�� ��ü ����
		Parent p1 = new Parent();
		p1.printParent();
		
	
		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü ����
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printParent(); // �ڵ����� ((Parent)c1).printParent();
		c1.printChild1(); 
		// c1���۷����� Parent, Child1 �Ѵ� ���� ����
		
		
		// ������ �ٷ� �������� ����� ���̽�
		// 3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü �ٷ�� ���");
		Parent p2 = new Child1();
		p2.printParent();
		//p2��� ���۷����� Parent���� ���� ����
		// ������ Child1�� �����ϰ��� �Ѵٸ� ���� ����ȯ�� �ϸ��!!
		
		((Child1) p2).printChild1(); //������ �Ǿ��ֱ� ������ ���� ����ȯ�Ͽ� �ҷ��� �� ����
		
		/*
		 * 
		 * ��ӱ��� Ŭ���� ������ ����ȯ ����!
		 * 
		 * 1. UpCasting
		 * 		�ڽ� Ÿ�� --> �θ�Ÿ��
		 *		�ڵ� ����ȯ
		 * 		ex) �θ�Ÿ�� = (�θ�Ÿ��) �ڽ� ��ü;
		 * 			(�θ�Ÿ��)�ڽ�.�θ�޼ҵ�();
		 * 
		 * 2. DownCasting
		 * 		�θ�Ÿ��  --> �ڽ� Ÿ��
		 * 		��������ȯ(���� �Ұ�)
		 * 		ex) ((�ڽ�Ÿ��)�θ�).�ڽĸ޼ҵ�();
		 * 
		 * 
		 */
		
	
		// -----------------------------------------------
		
		System.out.println("===================================");
		// �������� �־�����, ���������� �˾ƺ���!
		// ������ : �ϳ��� �θ�Ÿ������ ���������� �ڽ� ��ü �ٷ� �� �ִ� ����
		
		// Child1 ��ü 2��, Child2 ��ü 2��
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,3);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5,7,2);
		arr2[1] = new Child2(2,1,5);
		
		// ������ ��� ��
		
		Parent[] arr = new Parent[4];
		
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(5,7,2);
		arr[2] = new Child2(2,1,5);
		arr[3] = new Child1(2,3,5);
		// 부모 == 자식;
		
		
		
		// 하나의 부모타입으로 다양한 자식들을 받을 수 있다.
		// --> 자식들을 관리할 때 하나의 타입으로 관리할 수 있음 --> 편리하다 코드 길이가 감소
		
		// 각각의 담겨있는 자식클르새의 메소드 실행
		// --> 자식타입으로 형변환해서 자식 메소드 실행(단, 각 인덱스별로 실제로 참조하고 있는 실제 자식타입으로 형변환해야함!)
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("========== 반복문 이용 ===========");
		
		for(int i = 0; i<arr.length;i++) {	
			/*
			 * 
			 * 	instanceof 연산자
			 * 
			 * 	현재 레퍼런스가 어떤 자식 객체를 참조 하고 있는지 확인하는 연산자
			 * 
			 * [표현식] 레퍼런스 instanceof 클래스명
			 * 
			 * 해당 레퍼런스가 실제로 참조하고 있는 클래스 타입 해당클래스명과 일치하면 true, false
			 * 
			 */
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print(); // 동적바인딩 : 컴파일시에는 레퍼런스 타입에 클래스에 기술된 메소드로 바인딩 되지만
							//			실제 실행되는 건 실제로 참조하고 있는 자식클래스에 기술된 오버라이딩 메소드가 실행됨!!
			
			
		}
		
		
	}

}
