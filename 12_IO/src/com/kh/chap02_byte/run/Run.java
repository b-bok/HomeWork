package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {

	// "����Ʈ ��� ��Ʈ��" ������ ������ ����� �� ��!!
		
	// "����Ʈ ��Ʈ��" : �����͸� 1byte �ۿ� ���� �Ұ�	
	// "��� ��Ʈ��" : �ܺθ�ü�� ���������� ����Ǵ� ���!!
	
	// "����Ʈ ��� ��Ʈ��" --> �ܺθ�ü�� �����ϰ� �ܺθ�ü�� ���������� ����� ��ο� �����͸� 1byte ������ �����Ѵ�!
		
	// XXXInputStream  : XXX��ü�κ��� �����͸� �Է� �޴� ���
	// XXXOutputStream : XXX��ü�� �����͸� ����ϴ� ���
	
	// File InputStream/ File OutputStream : -->�ܺ� ��ü�� file�� �ϰھ�!
	// Audio InputStrem/ Audio OutputStream : -->�ܺθ�ü�� ����� ��ġ!
	// Piped InputStrem/ OutPustStream
		
		FileByteTest fb = new FileByteTest();
		
		fb.fileSave();
		
	}

}
