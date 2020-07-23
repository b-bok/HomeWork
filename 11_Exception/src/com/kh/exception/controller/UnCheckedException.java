package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {

	
	/*
	 *  * RuntimeException
	 * 	- ���α׷� ����� �߻��Ǵ� ����(���������� �������� ����!!) --> ���� ó���� �ʼ��� �ƴ�
	 * 
	 *  * RuntimeException�� �ļյ�
	 *  - NullPointerException : ���۷��������� null�� ���¿��� �޼ҵ带 ȣ���ϴ� ���
	 *  - ArrayIndexOutOfBOundException : �迭�� ���ٿ� �������� �ε��� �� �������� ���
	 *  - ClassCastException : ����� �� ���� ����ȯ ����Ǵ� ���
	 *  - ArithmeticException : ������ ����� 0���� ���� ���
	 *  - NegativeArraySizeException : �迭�� ũ�⸦ ������ �������� ���
	 *  
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException : ������ ����� 0���� ���� ���
		
		// ����ڿ��� �ΰ� ������ �ް�, ������ ���� ��� ���
		
	
			
			System.out.print("���� 1 : ");
			int num1 = sc.nextInt();
					
			System.out.print("���� 2 (0 �Է�����������) : ");		
			int num2 = sc.nextInt();
			
			
			
			/*
			 * ���ʿ� ������ü�� �߻����� �ȵǰԲ� ���� �˻� ==> ���� ó�� �ƴ�
			int result = 0;
			
			if(num2 != 0) {
	
				result = num1 / num2;
			}
			
			System.out.println("��� : " + result);
			System.out.println("���α׷� ����");
			 */
			
			// ���� ó�� : ���ܰ� �߻����� �� ó���ϴ� ������ �̸� ����صδ� ��
			/*
			 * *try catch ���
			 * 		
			 * try {
			 * 
			 * 	���ܰ� �߻��ɹ��� ����;
			 * 	���ܰ� �߻��ɹ��� ����;
			 * 	���ܰ� �߻��ɹ��� ����;
			 * 
			 * }catch(�߻��ɿ���Ŭ������ ������) { // ���� ĳġ ����
			 * 
			 * 		�ش� ���ܰ� �߻��Ǵ� ��� ó���� ����;
			 * 
			 * }catch(�߻��ɿ���Ŭ������ ������) {
			 * 
			 * 		�ش� ���ܰ� �߻��Ǵ� ��� ó���� ����;
			 * 
			 * }catch(�߻��ɿ���Ŭ������ ������) {
			 * 
			 * 		�ش� ���ܰ� �߻��Ǵ� ��� ó���� ����;
			 * 
			 * }
			 * 
			 */
			
			int result = 0;
			
			try {
				result = num1/num2;
				
			}catch(ArithmeticException e) {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			
			
			System.out.println("��� : " + result);
			System.out.println("���α׷� ����");
	}
	
	
	
	public void method2() {
		
		
		// ���ʿ� ������ü�� �߻� �ȵǰԲ� ����ó�� ����
		
		/*
		
		if(size>0) {
			
			int[] arr = new int[size];
			System.out.println("0�� �ε����� : " + arr[0]);
			
		}
		*/
		
		try {
			System.out.print("�迭�� ũ�� �Է� : ");
			int size = sc.nextInt();
			
			
			int[] arr = new int[size];
			System.out.println("0�� �ε����� : " + arr[0]);
			
		//NegativeArraySizeException : �迭 ũ�������� ������ ���� ��	
				
		}catch(NegativeArraySizeException e) {
			
			System.out.println("��� �Է��Ͻÿ�!");
	
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("�������� �ε�����!");
			
		} catch(InputMismatchException e) {
			
			System.out.println("������ �Է����ּ���");
			
		} catch(RuntimeException e) { // �̰͸����� ��� ���ܸ� ó���� �� ������ ��Ȯ�� �亯 �� ������!
									  // �Ѳ����� vs �ڼ��ϰ� Ȯ���ϰ�	
			System.out.println("���� ���!");
		}
		
		
		System.out.println("���α׷� ����");

	}
	
	
	// UnCheckedException�� ���� ó�� �ص� �ǰ� ���ص���!
	// ���� ������ ��Ȳ�̰�, if������ ���� ó���� ���� => �̸� �ڵ鸵 ���ִ°� ���� ����
	// 
	
}	
