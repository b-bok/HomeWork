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
	// 간단 버전
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
		
		if(search == 1) {//제목으로 검색
			
			for(int i = 0; i<list.size();i++) {
				
				if(list.get(i).getTitle().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
				
				
			}
			
		}else if(search == 2) {// 가수명으로 검색
			
			for(int i = 0; i<list.size();i++) {
				
				if(list.get(i).getArtist().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
				
				
			}
		}else if(search == 3) {// 제목+가수명으로 검색
			
			for(int i = 0; i<list.size();i++) {
				
				
				//방법1. 곡명 따로, 가수명 따로 합집합
				
				//if(list.get(i).getArtist().contains(keyword) || 
				//		list.get(i).getTitle().contains(keyword) ) {
					
				
				//방법2. 곡명과 가수명 하나의 문자열로 합친 후 contains로 비교하는 방법("이밤양다일")
				
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)) {
				
					searchList.add(list.get(i));
				}
				
				
			}
			
		}
		
		
		return searchList;
		
		
	}
	
	
	public int deleteMusic(String title) {
		
		
		int result = 0; // 처리 결과 보관 변수
		
		
		
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				list.remove(i--);
				result++;
				// ArrayList는 알아서 당겨주기 때문에 이를 방지해 주기 위해
				//i--; 하거나 remove(i--);
			}
			
		}
		// 반복문이 끝나서 result = 0 => 삭제할 곡 없음
		// 반복문 result >= 0 ==> 삭제 result개 했음
		
		return result;
	}

	public int updateMusic(String title,String upTitle, String upArtist) {
		
		
		int updateCount = 0;
		
		// 방법 1. setter 메소드 활용
		/*for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i) == 수정할 곡
				
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				updateCount++;
			}*/
		
		// 방법2. ArrayList set 메소드 활용!
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i) == 수정할 곡
				
				list.set(i, new Music(upTitle,upArtist));
				updateCount++;

			}
		
		
		}
	
		return updateCount;
		
	}
	
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// 복사본 리스트 
		ArrayList<Music> sortList = new ArrayList<>(); // 비어있는 리스트 
		sortList.addAll(list);	// list 담긴 내용 통째로 옮겨담기
		
		
		/*
		 *  ex)
		 *  M1.compareTo(M2) : 반환값이 양수일경우, M1과 M2 자리변경
		 *  M2.compareTo(M3) : 반환값이 양수일경우, M2과 M3 자리변경
		 *  정렬 기준을 만들어줘야한다!
		 * 
		 */
		
		
		switch(menu) {
		case 1 : Collections.sort(sortList); break; //가수명 오름차순 정렬
		case 2 : Collections.sort(sortList, new ArtistDesc()); break;	//가수명 내림차순 정렬
		
		
		/*
		 * case 2 : Collections.sort(sortList, new Comparator<Music>() { // 여기에서도 오버라이딩
		 * 가능하다!ㅋㅋㅋㅋㅋ // 익명 클래스라고 한다.
		 * 
		 * 
		 * @Override public int compare(Music o1, Music o2) {
		 * 
		 * return 0; }
		 * 
		 * 
		 * 
		 * 
		 * }); break; //가수명 내림차순 정렬
		 */		
		
		
		case 3 : Collections.sort(sortList, new TitleAsc()); break; 	//곡명 오름차순 정렬
		
		/*익명 클래스
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
		
		
		
		
		
		
		
		
		
		
		
		case 4 : Collections.sort(sortList, new TitleDesc()); break;	//곡명 내림차순 정렬 
		}
		
		return sortList;
	}
	

	
}
