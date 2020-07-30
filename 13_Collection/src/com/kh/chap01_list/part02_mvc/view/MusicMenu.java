package com.kh.chap01_list.part02_mvc.view;
import java.util.*;
import com.kh.chap01_list.part02_mvc.controller.*;
import com.kh.chap01_list.part02_mvc.model.vo.Music;
public class MusicMenu {

	// ��ĳ�ʸ� �ش� Ŭ���� �������� �� �� �ֵ���!
	private Scanner sc = new Scanner(System.in);
	// �ٷ� Controller ��û �� �� �ְԲ�
	private MusicController mc = new MusicController();
	
	/**
	 * 
	 * * ���α׷� ���� �� ����ڰ� ���ԵǴ� ù ȭ��
	 * 
	 * 
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome ���� ==");
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� �����ϱ�");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectList(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 6 : sortMusic(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
			
			}
			
			
		}	
	}
	
	public void insertMusic() {
		
		System.out.println("\n=== �ű� �� �߰� ===");
		
		
		System.out.print("���� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �̸� �Է� : ");
		String artist = sc.nextLine();
		
		// �� �߰� ��û!!(Controller �޼ҵ� ȣ��!!)
		mc.insertMusic(new Music(title, artist));
		
		System.out.println("���������� ���� �߰��Ǿ����ϴ�!");
		
	}
	
	
	public void selectList() {
		
		System.out.println("\n=== �� ��ü ��ȸ ===");
		
		// �� ��ü ��ȸ��û(Controller �޼ҵ� ȣ��!!)
		ArrayList<Music> list = mc.selectList();
		

		//����Ʈ�� ����ִ��� Ȯ�� --> �����ϴ� ���� ����!
		if(list.isEmpty()) {// ����Ʈ ������� --> �����ϴ� �� ����!
			System.out.println("���� �����ϴ�!");
		}else { // ����Ʈ ������� ����! --> �����ϴ� �� �ִ�!
			System.out.println("��ü " + list.size() + "���� ���� ��ȸ�մϴ�!");
			/*
			 * for(Music m : list) { System.out.println(m.toString()); }
			 */
			
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("�� ��ü ��ȸ�� �Ϸ�Ǿ����ϴ�!");
		}
		
		
		
		
	}
	
	/**
	 *  3. ����ڿ��� �˻��� �Է¹��� �� �ش� �˻� ��� ����ִ� ȭ��
	 * 
	 */
	
	public void searchMusic() {
		
		System.out.println("\n=== Ư�� �� �˻� ===");
		
		System.out.println("1. �������� �˻�");
		System.out.println("2. ���������� �˻�");
		System.out.println("3. ���� +���������� �˻�");
		System.out.print("�޴� ����  : ");
		int search = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�˻��� �� Ű���� : ");
		String keyword = sc.nextLine();
		
		//�˻� ��û!
		ArrayList<Music> searchList = mc.searchMusic(keyword,search);
		
		if(searchList.isEmpty()) {// ����Ʈ �������!
			
			System.out.println(keyword + "�� ���� �˻������ �����ϴ�!");
			
		}else { // ����Ʈ ������� ����! --> �����ϴ� �� �ִ�!
			System.out.println("��ü " + searchList.size() + "���� ���� ��ȸ�մϴ�!");
			
			for(Music m : searchList) {
				System.out.println(m.toString());
				
			}
			System.out.println("�� ��ü ��ȸ�� �Ϸ�Ǿ����ϴ�!");
		}
		
		
	}
	
	public void deleteMusic() {
		
		System.out.println("\n=== Ư�� �� ���� ===");
		
		
		System.out.print("�����ҷ��� �� �� : ");
		String title = sc.nextLine();
		
		// �� ���� ��û! (Controller)
		int deleteCount = mc.deleteMusic(title);
		
		if(deleteCount == 0) {
			System.out.println("�����Ϸ��� ���� �����ϴ�.");
		}else {
			System.out.println(deleteCount + "���� ���� ���� �߽��ϴ�.");
		}
		

	}
	
	public void updateMusic() {
		
		System.out.println("\n=== Ư�� �� ���� ===");
		
		// � ���� ������ ���� �����ϰ��� �ϴ� ���
		System.out.print("�����Ϸ��� �� �� : ");
		String title = sc.nextLine();
		
		
		// � �������� ������ ���� ������ ���
		System.out.print("�������� (�� ��) : ");
		String upTitle = sc.nextLine();
		// � �������� ������ ���� ������ ������
		System.out.print("�������� (���� ��) : ");
		String upArtist = sc.nextLine();
		
		// �� ���� ��û�ϱ�!!
		int updateCount = mc.updateMusic(title,upTitle,upArtist);
		
		if(updateCount == 0) {
			System.out.println("�����ϰ��� �ϴ� ���� �����ϴ�.");
		}else {
			System.out.println("������ �Ϸ��߽��ϴ�.");
		}
			
	}	
	
	/**
	 *  6. �� ������ ��� ��ȸ�ϱ�
	 * 
	 */
	public void sortMusic() {
		
		System.out.println("\n === �� �����ϱ� ===");
		System.out.println("1. ������ �������� ����");
		System.out.println("2. ������ �������� ����");
		System.out.println("3. ��� �������� ����");
		System.out.println("4. ��� �������� ����");
		
		System.out.print("��ȣ ���� : ");
		int menu = sc.nextInt();
		
		// �� ���� ��ȸ ��û!
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		System.out.println(sortList);
		
		
		
		
		
		
		
		
		
	}
}
