package com.kh.chap01_math.run;

public class Run {

	public static void main(String[] args) {

	// java.lang --> �̹� import�Ǿ� �ִ�!	
		
	// ����ʵ�	
		System.out.println("���� : " + Math.PI);
		
	// ���밪�� �˰��� �� ��  : abs
		
		int num1 = -10;
		
		System.out.println("���밪 : " + Math.abs(num1));
		
	// �ø� : ceil
		
		double num2 = 4.349;
		
		System.out.println("�ø� : " + (int)Math.ceil(num2));
			
	
	// �ݿø� : round
		System.out.println("�ݿø� : " + Math.round(num2*10)*0.1);
		
	// ���� : floor
		System.out.println("���� : " + Math.floor(num2));
		
	// ���� ����� ������ : rint
		
		System.out.println(num2 + "�� ���� ����� ������ : " + Math.rint(num2));
		
	// ������(��Ʈ) : sqrt
		System.out.println("4�� ������ : " + Math.sqrt(4.8));
		
	// ���� : pow(��,����Ƚ��);
		
	System.out.println("2�� 10 ������? : " + Math.pow(2,5));
	}

	// Math Ư¡
	// ��� �ʵ� ����ʵ�, ��� �޼ҵ� static �޼ҵ�!!
	// ���� static
	// ������ ��� private --> ��ü ������ �ʿ���� ������
	
	
	// staic --> ���α׷� ������ �� �� �ѹ� static �޸𸮿����� �ø�!!
	// 			 Math ��ü ���� ���� Ŭ������. ���� ���� ����
	// �ѹ��� �޸� ������ �÷����� �����ϴ� ���� --> �̱�������
	
}
