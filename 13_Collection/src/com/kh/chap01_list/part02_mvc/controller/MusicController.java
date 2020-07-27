package com.kh.chap01_list.part02_mvc.controller;
import java.util.*;
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
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchMusic = new ArrayList<Music>();
		
		for(int i = 0; i<list.size();i++) {
			
			
			
		}
		
		return searchMusic;
	}
}
