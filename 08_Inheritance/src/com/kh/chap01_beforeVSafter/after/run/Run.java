package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//��ü ����
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũ",1500000,true);
		
		//��ü ����
		Tv t = new Tv("LG","t-01","�̳�����Ƽ��",3500000,60);
		
		//��ü ����
		SmartPhone s = new SmartPhone("����","s-01","������11pro",1500000,"KT");
		
		// ������ �ѹ� �˾ƺ���!!
		Product p1 = new Desktop();
		Product p2 = new Tv();
		Product p3 = new SmartPhone();
		
		Product[] arr = new Product[3];
		arr[1] = new Desktop();
		arr[2] = new Tv();
		arr[3] = new SmartPhone();
		
	
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 
		 * * ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� ���� ����
		 * - �ڵ带 ������ �����ϹǷ�, ���ο� �ڵ� �߰� �� ������ �����ϴ�.
		 * --> �ߺ��ڵ� ���Ÿ� ���� ���꼺 ���
		 * 
		 * * ����� Ư¡
		 * - Ŭ������ ����� ���� ��Ӹ� ����(���߻�� �Ұ�)
		 * - �θ��� Private ���������ڷ� ����Ǿ��ִ� ���� ��ӱ������ص� �������� �Ұ�
		 * 		(��, Protected�� �ϰ� �Ǹ� �ڽĿ��� ���� ���� ����)
		 * - ��õǾ����� ������ ��� Ŭ������ objcet Ŭ������ �ļ��̴�!
		 * --> ObjectŬ������ �����ϴ� �޼ҵ�� �󸶵��� ��밡���ϴ�!
		 * --> ���� �ȵ�� �Ը���� ������(�������̵�) ����
		 * 
		 * 
		 */
		
	}

}
