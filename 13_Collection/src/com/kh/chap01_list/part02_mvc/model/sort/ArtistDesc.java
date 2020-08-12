package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 가수명 내림차순 정렬기준

public class ArtistDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
	
		// compare(m1, m2)		=> 양수값 반환하면 자리 변경! 
		// 		   o1(앞), o2(뒤)
		
		// o1(앞)  vs   o2(뒤)
		
		
		
		// o2(뒤)가 o1(앞)보다 클경우 ==> 자리변경 => 양수값 반환
		
		/*if(o2.getArtist() > o1.getArtist()) > 0) {
			return 1;
		}else {
			return 0 or -1;
		}*/
		
		
		
		return o2.getArtist().compareTo(o1.getArtist());
	}

	
}
