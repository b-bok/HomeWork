package com.kh.part01_objectVSobjectArray.run;
import com.kh.part01_objectVSobjectArray.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
		Product[] arr = new Product[3];
		
		//System.out.println(arr[0].getName()); java.lang.NullPointerException : null.~ ���� �������� �� �߻�
		
		
		// �� �ε������� ��ü �����ϱ�
		arr[0] = new Product("���ϼ�","����",1300000);
		arr[1] = new Product("������ ","���",1500000);
		arr[2] = new Product();
		
		// for loop��
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		
		arr[2].setName("����");
		arr[2].setBrand("����");
		arr[2].setPrice(8000000);
		
		System.out.println("======== ���� �� =========");
		
		// for each��(���� for��)
		
		int [] num = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		// for(�������� �� ���� ������ ���� : ���������� �����ϰ����ϴ� �迭��)
		for(int n : num) { 	// int n = num[0];
							// int n = num[1];
							// int n = num[2];
			System.out.println(n + " ");
		}
		
		
		for(Product p : arr) {
			// Product p = arr[0];
			// Product p = arr[1];
			// product p = arr[2];
			System.out.println(p.information());
		}
		
		
	}

}
