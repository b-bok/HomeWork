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
