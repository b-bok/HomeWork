package com.kh.chap01_list.part02_mvc.controller;
import java.util.*;

import com.kh.chap01_list.part02_mvc.model.sort.*;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<Music>();
	
	/*
	 * public void insertMusic(String title, String artist) {
	 * 
	 * list.add(new Music(title,artist));
	 * 
	 * }
	 * 
	 */
	
	public void insertMusic(Music m) {
		list.add(m);
	}
	
	
	public ArrayList<Music> selectList() {
		
		/*
		 * for(Music m : list) { System.out.println(list.toString()); }
		 */
		return list;
	}
	// ���� ����
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		for(int i = 0; i<list.size();i++) {
			
			if(list.get(i).getTitle().contains(keyword)) {
				
				searchList.add(list.get(i));
			}
			
			
		}
		
		return searchList;
	}
	
	
	
	public ArrayList<Music> searchMusic(String keyword, int search) {
		
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		if(search == 1) {//�������� �˻�
			
			for(int i = 0; i<list.size();i++) {
				
				if(list.get(i).getTitle().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
				
				
			}
			
		}else if(search == 2) {// ���������� �˻�
			
			for(int i = 0; i<list.size();i++) {
				
				if(list.get(i).getArtist().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
				
				
			}
		}else if(search == 3) {// ����+���������� �˻�
			
			for(int i = 0; i<list.size();i++) {
				
				
				//���1. ��� ����, ������ ���� ������
				
				//if(list.get(i).getArtist().contains(keyword) || 
				//		list.get(i).getTitle().contains(keyword) ) {
					
				
				//���2. ���� ������ �ϳ��� ���ڿ��� ��ģ �� contains�� ���ϴ� ���("�̹�����")
				
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)) {
				
					searchList.add(list.get(i));
				}
				
				
			}
			
		}
		
		
		return searchList;
		
		
	}
	
	
	public int deleteMusic(String title) {
		
		
		int result = 0; // ó�� ��� ���� ����
		
		
		
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				list.remove(i--);
				result++;
				// ArrayList�� �˾Ƽ� ����ֱ� ������ �̸� ������ �ֱ� ����
				//i--; �ϰų� remove(i--);
			}
			
		}
		// �ݺ����� ������ result = 0 => ������ �� ����
		// �ݺ��� result >= 0 ==> ���� result�� ����
		
		return result;
	}

	public int updateMusic(String title,String upTitle, String upArtist) {
		
		
		int updateCount = 0;
		
		// ��� 1. setter �޼ҵ� Ȱ��
		/*for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i) == ������ ��
				
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				updateCount++;
			}*/
		
		// ���2. ArrayList set �޼ҵ� Ȱ��!
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i) == ������ ��
				
				list.set(i, new Music(upTitle,upArtist));
				updateCount++;

			}
		
		
		}
	
		return updateCount;
		
	}
	
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// ���纻 ����Ʈ 
		ArrayList<Music> sortList = new ArrayList<>(); // ����ִ� ����Ʈ 
		sortList.addAll(list);	// list ��� ���� ��°�� �Űܴ��
		
		
		/*
		 *  ex)
		 *  M1.compareTo(M2) : ��ȯ���� ����ϰ��, M1�� M2 �ڸ�����
		 *  M2.compareTo(M3) : ��ȯ���� ����ϰ��, M2�� M3 �ڸ�����
		 *  ���� ������ ���������Ѵ�!
		 * 
		 */
		
		
		switch(menu) {
		case 1 : Collections.sort(sortList); break; //������ �������� ����
		case 2 : Collections.sort(sortList, new ArtistDesc()); break;	//������ �������� ����
		
		
		/*
		 * case 2 : Collections.sort(sortList, new Comparator<Music>() { // ���⿡���� �������̵�
		 * �����ϴ�!���������� // �͸� Ŭ������� �Ѵ�.
		 * 
		 * 
		 * @Override public int compare(Music o1, Music o2) {
		 * 
		 * return 0; }
		 * 
		 * 
		 * 
		 * 
		 * }); break; //������ �������� ����
		 */		
		
		
		case 3 : Collections.sort(sortList, new TitleAsc()); break; 	//��� �������� ����
		
		/*�͸� Ŭ����
		 * 
		 * case 3 : Collections.sort(sortList, new Comparator<Music>() {
		 * 
		 * @Override public int compare(Music o1, Music o2) {
		 * 
		 * return o1.getTitle().compareTo(o2.getTitle()); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }); break;
		 */
		
		
		
		
		
		
		
		
		
		
		
		case 4 : Collections.sort(sortList, new TitleDesc()); break;	//��� �������� ���� 
		}
		
		return sortList;
	}
	

	
}
