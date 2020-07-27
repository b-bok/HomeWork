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
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectList(); break;
			case 3 : searchMusic(); break;
			case 4 : break;
			case 5 : break;
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
	
	public void searchMusic() {
		
		System.out.println("\n=== Ư�� �� �˻� ===");
		
		System.out.print("���� �˻��� �ּ��� ! : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchMusic = mc.searchMusic(keyword);
		
		if(searchMusic.isEmpty()) {// ����Ʈ ������� --> �����ϴ� �� ����!
			System.out.println("ã�� ���� �����ϴ�!");
		}else { // ����Ʈ ������� ����! --> �����ϴ� �� �ִ�!
			System.out.println("��ü " + searchMusic.size() + "���� ���� ��ȸ�մϴ�!");
			for(Music m : searchMusic) {
				System.out.println(m.toString());
			}
			System.out.println("�� ��ü ��ȸ�� �Ϸ�Ǿ����ϴ�!");
		}
		
		
	}
	
}
